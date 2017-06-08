package Huxley_421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;


/* Aluno: Gosvãmi Raphael Santos Dantas
 * UNIFACISA - Sistemas de Informação
 * Professor: Daniel Abella Cavalcante Mendonça de Souza
 * Disciplina: ATAL - Análise e técnicas de Algoritmos
 * Problema: Huxley - Problema: 421 - Divisões
 * 
 * 
 */

public class Divisao {

	public static void main(String args[]) {
		principal(new BufferedReader(new InputStreamReader(System.in)), System.out);
	}

	public static void principal(BufferedReader leitor, PrintStream ps1) {
		StringBuilder sb1;

		try (Scanner scanner = new Scanner(leitor)) {
			sb1 = new StringBuilder();
		
			int n = 0;
			while ((n = scanner.nextInt()) != 0) {
				if (sb1.length() > 0) {
					sb1.append("\n");
				}

				encontrarPares(sb1, n);
			}

			ps1.append(sb1);
		} catch (Exception e) {
			throw e;
		}
	}

	private static CharSequence encontrarPares(StringBuilder sb1, int numero) {
		boolean encontrado = false;
		
		for (int abc1 = 1234; abc1 <= (98765 / numero); abc1++) {
			int abc2 = abc1 * numero;
			int usado = 0;
			int n = abc2;
			int d = abc1;
			
			while (n > 0) {
				usado |= 1 << (n % 10);
				usado |= 1 << (d % 10);
				n = n / 10;
				d = d / 10;
			}
			
			if (usado == 0b1111111111) {
				sb1.append(String.format("%05d / %05d = %d\n", abc2, abc1, numero));
				encontrado = true;
			}
			
		}

		if (!encontrado) {
			sb1.append("Não existe solução para ").append(numero).append(".\n");
		}
		
		return sb1;
	}
}


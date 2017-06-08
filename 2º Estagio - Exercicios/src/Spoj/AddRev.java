package Spoj;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddRev {
	
	/* Aluno: Gosvãmi Raphael Santos Dantas
	 * UNIFACISA - Sistemas de Informação
	 * Professor: Daniel Abella Cavalcante Mendonça de Souza
	 * Disciplina: ATAL - Análise e técnicas de Algoritmos
	 * Problema: http://www.spoj.com/problems/ADDREV/
	 * 
	 * 
	 */


    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer num_linhas = Integer.valueOf(sc.nextLine());
        List<Integer> resultado = new ArrayList<Integer>();
        for (int i=0; i<num_linhas; i++) {
            final String linha = sc.nextLine();
            String[] divisao_linha = linha.split(" ");
            resultado.add(adicionarRev(divisao_linha[0], divisao_linha[1]));
        }

        for(Integer x : resultado) {
            System.out.println(x);
        }

        return;
    }

    public static Integer adicionarRev(String numero1, String numero2) {
        Integer revNumero1 = RevNumero(numero1);
        Integer revNumero2 = RevNumero(numero2);
        Integer soma = revNumero1 + revNumero2;
        Integer revSoma = RevNumero(soma.toString());
        return revSoma;
    }

    public static Integer RevNumero(String numero) {
        String novoNumero = "";
        boolean ZeroADireita = true;
        for (int i = numero.length()-1; i>=0; i--) {
            if (numero.charAt(i) == '0' && ZeroADireita) {
                continue;
            } else {
                ZeroADireita = false;
            }
            novoNumero = novoNumero + numero.charAt(i);
        }
        if (novoNumero.isEmpty()) {
            novoNumero += '0';
        }
        return Integer.valueOf(novoNumero);
    }
}
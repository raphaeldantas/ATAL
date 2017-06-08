package Huxley_418;
import java.util.Arrays;


/* Aluno: Gosv�mi Raphael Santos Dantas
 * UNIFACISA - Sistemas de Informa��o
 * Professor: Daniel Abella Cavalcante Mendon�a de Souza
 * Disciplina: ATAL - An�lise e t�cnicas de Algoritmos
 * Problema: Huxley - Problema: 418 - Permuta��es
 * 
 * 
 */


public class Permuta��es {
	

	public static void main(String[] args) {

        String numeros = "123";
        String[] guardarNumeros = numeros.split("");
        permutar(guardarNumeros, guardarNumeros.length);

    }

    private static void swap(String[] guardarNumeros, int direita, int esquerda) {
        String temp = guardarNumeros[direita];
        guardarNumeros[direita] = guardarNumeros[esquerda];
        guardarNumeros[esquerda] = temp;
    }

    public static void permutar(String[] guardarNumeros, int PosicaoAtual) {
        if (PosicaoAtual == 1) {
            System.out.println(Arrays.toString(guardarNumeros));
        } else {
            for (int i = 0; i < PosicaoAtual; i++) {
               	// Remover da �ltima posi��o (aqui � onde estamos)
                // Selecionando o pr�ximo �ltimo item
                permutar(guardarNumeros, PosicaoAtual - 1);

                // Verifica Se o numero � impar
                if (PosicaoAtual % 2 == 1) {
                    swap(guardarNumeros, 0, PosicaoAtual - 1);
                } else {
                    swap(guardarNumeros, i, PosicaoAtual - 1);
                }
            }
        }
    }
    
}

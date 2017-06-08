package Huxley_418;
import java.util.Arrays;


/* Aluno: Gosvãmi Raphael Santos Dantas
 * UNIFACISA - Sistemas de Informação
 * Professor: Daniel Abella Cavalcante Mendonça de Souza
 * Disciplina: ATAL - Análise e técnicas de Algoritmos
 * Problema: Huxley - Problema: 418 - Permutações
 * 
 * 
 */


public class Permutações {
	

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
               	// Remover da última posição (aqui é onde estamos)
                // Selecionando o próximo último item
                permutar(guardarNumeros, PosicaoAtual - 1);

                // Verifica Se o numero é impar
                if (PosicaoAtual % 2 == 1) {
                    swap(guardarNumeros, 0, PosicaoAtual - 1);
                } else {
                    swap(guardarNumeros, i, PosicaoAtual - 1);
                }
            }
        }
    }
    
}

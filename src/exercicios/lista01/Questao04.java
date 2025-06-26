package exercicios.lista01;

import java.util.Scanner;

// Questão 4:
//    - Crie um algoritmo que receba os dados de dois vetores separadamente.
//    - O primeiro vetor terá 10 elementos e o segundo vetor 7.
//    - Ordene esses vetores separadamente de forma ascendente.
//    - Depois preencha um terceiro de vetor de 17 posições também ordenado.

public class Questao04 {


/*  Algoritmo de Ordenação Bubble Sort (Loop Externo Crescente)
    public static void bubbleSort(int[] vetor) {
        for (int in = 0; in < vetor.length - 1; in++) {
            for (int out = 0; out < vetor.length - 1 - i; out++) {
                if (vetor[out] > vetor[out + 1]) {
                    int temp = vetor[out];
                    vetor[out] = vetor[out + 1];
                    vetor[out + 1] = temp;
                }
            }
        }
    }
*/

    // Algoritmo de Ordenação Bubble Sort (Loop Externo Decrescente)
    public static void bubbleSort(int[] vetor) {

        // Loop externo decrescente (De trás pra frente)
        for (int out = vetor.length - 1; out > 0; out--) {

            // Loop interno crescente (do início até out)
            for (int in = 0; in < out; in++) {

                // Verifica se o elemento da posição atual do vetor é maior que o elemento da posição posterior
                if (vetor[in] > vetor[in + 1]) {

                    // Se sim, o elemento da posição atual do vetor será armazenado na variável "temp"(variável auxiliar)
                    int temp = vetor[in];

                    // Em seguida o índice atual do vetor receberá o elemento do índice posterior
                    vetor[in] = vetor[in + 1];

                    // E, por último, o elemento que estava armazenado na variável "temp" será atribuído ao índice posterior
                    vetor[in + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cria três vetores, sendo o primeiro com 10 posições, o segundo com 7 e o terceiro com 17.
        int[] vetorA = new int[10];
        int[] vetorB = new int[7];
        int[] vetorC = new int[17];

        // Pecorre o "vetorA" e insere em cada índice do vetor os números que o usuário informou.
        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }

        // Pecorre o "vetorB" e insere em cada índice do vetor os números que o usuário informou.
        System.out.println("Digite 7 números para o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }

        // Usamos Bubble Sort para ordenar cada um separadamente.
        bubbleSort(vetorA);
        bubbleSort(vetorB);

        // Atribui os elementos do "vetorA" ao "vetorC"
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }

        // Atribui os elementos do "vetorB" ao "vetorC", mas antes disso é realizada a soma dos índices do "vetorC"
        // com o "vetorA" para que os elementos do "vetorB" sejam atribuídos aos índices restantes do "vetorC".
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[i + vetorA.length] = vetorB[i];
        }

        // Ordena o "vetorC"
        bubbleSort(vetorC);

        // Exibe os elementos do vetorC ordenados.
        System.out.println("\nVetor C ordenado:");
        for (int i : vetorC) {
            System.out.print(i + " ");
        }
    }
}


package exercicios.lista01;

import java.util.Scanner;

// Questão 02 - Crie um programa que solicite a entrada de 10 números pelo usuário,
// armazenando-os em um vetor, e então monte outro vetor com os valores do primeiro
// multiplicados por 5. Exiba os valores dos dois vetores na tela, simultaneamente, em duas
// colunas (um em cada coluna), uma posição por linha.

public class Questao02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Cria dois vetores do tipo inteiro com 10 posições.
        int[] numeros = new int[10];
        int[] multiplicados = new int[10];

        // 2. Pecorre cada posição do vetor e armazena os valores digitados pelo usuário no vetor "numeros".
        // Por último, o vetor "multiplicados" armazena os valores do vetor "numeros" e realiza a multiplicação por 5.
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
            multiplicados[i] = numeros[i] * 5;
        }

        // 3. Pecorre o vetor e exibe os números e os valores multiplicados lado a lado.
        System.out.println("\nNúmero | Multiplicado");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i] + "\t | " + multiplicados[i]);
        }
    }
}


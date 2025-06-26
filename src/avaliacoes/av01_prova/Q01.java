package avaliacoes.av01_prova;

import java.util.Scanner;

/*
    Questão 6 – Crie um programa em java que crie um vetor de 10 elementos, receba o
    conteúdo dos elementos de índices impares do vetor através de digitação, e para os
    elementos de índices pares do vetor o conteúdo deve ser calculado usando a seguinte
    fórmula (Indice * 2).
*/

public class Q01 {
    public static void main(String[] args) {

        Scanner ser = new Scanner(System.in);
        int[] numeros = new int[10];

        // Preenchendo o Vetor
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                numeros[i] = i * 2; // índice par → fórmula
            } else {
                System.out.print("Digite o número para o índice " + i + ": ");
                numeros[i] = ser.nextInt(); // índice ímpar → entrada do usuário
            }
        }

        System.out.println("\nConteúdo do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        ser.close();
    }
}

package exercicios.lista01;

import java.util.Scanner;

// Questão 01 - Escreva um algoritmo que solicite ao usuário a entrada de 5 nomes, e que
// exiba a lista desses nomes na tela. Após exibir essa lista, o programa deve mostrar
// também os nomes na ordem inversa em que o usuário os digitou, um por linha.

public class Questao01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Cria um vetor do tipo String com 5 posições.
        String[] nomes = new String[5];

        // 2. Pecorre cada posição do vetor e para cada posição do vetor é inserida o valor digitado pelo usuário.
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = sc.nextLine();
        }

        // 3. Exibe os nomes na ordem digitada
        System.out.println("\nNomes na ordem digitada:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        // 4. Exibe os nomes na ordem inversa
        System.out.println("\nNomes na ordem inversa:");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}

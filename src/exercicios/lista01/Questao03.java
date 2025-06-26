package exercicios.lista01;

import java.util.Scanner;

// Questão 03 - Crie um programa que armazene 10 números digitados pelo usuário em
// dois vetores: um somente para números pares, e outro somente para números ímpares.
// Após isso, exiba os valores dos dois vetores na tela, em sequência.
// OBS: As posições que não receberem valores exibirão o número zero. Não se preocupe com isso por enquanto.

public class Questao03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1. Cria os vetores "numeros", "pares" e "impares" cada um com o tamanho máximo de 10 posições declaradas.
        int[] numeros = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];

        //2. Pecorre o vetor "numeros" e a cada posição pecorrida no vetor é inserido um valor digitado pelo usuário
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            //3. Divide o valor do número inserido pelo usuário por 2 e caso o resto da divisão for igual a 0,
            // o valor é armazenado na variável "pares", do contrário, o valor será armazenado na variável "impares".
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            } else {
                impares[i] = numeros[i];
            }
        }

        //4. Pecorre cada valor da variável "pares" e exibe na tela.
        System.out.println("\nVetor de Pares:");
        for (int par : pares) {
            System.out.print(par + " ");
        }

        //5. Pecorre cada valor da variável "impares" e exibe na tela.
        System.out.println("\n\nVetor de Ímpares:");
        for (int impar : impares) {
            System.out.print(impar + " ");
        }
    }
}

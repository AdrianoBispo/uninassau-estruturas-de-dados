package exercicios.lista02;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        Scanner ser = new Scanner(System.in);

        int[] idade = new int[10];
        String[] nome = new String[10];

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Digite o nome da cidade:");
            nome[i] = ser.nextLine();
            System.out.println("Digite a população da cidade:");
            idade[i] = ser.nextInt();
            ser.nextLine(); // Limpar Buffer
        }


// ALGORITMO DE ORDENAÇÃO BUBBLE SORT

        // DECLARA VARIÁVEIS DO ALGORITMO BUBBLE SORT
        int out; // A variável "out" é responsável por armazenar o valor da última posição do vetor.
        int in; // A variável "in" é responsável por armazenar o valor da primeira posição do vetor.
        int temp = 0; // variável auxiliar responsável por armazenar as idades temporariamente
        String temps = ""; // Variável auxiliar responsável por armazenar os nomes temporariamente

        // loop externo (trás para frente)
        for (out = nome.length - 1; out > 0; out--)

            // loop interno (em frente)
            for (in = 0; in < out; in++) {

                // fora de ordem?
                if (idade[in] > idade[in + 1]) {
                    temp = idade[in];
                    idade[in] = idade[in + 1];
                    idade[in + 1] = temp;

                    temps = nome[in];
                    nome[in] = nome[in + 1];
                    nome[in + 1] = temps;
                }
            }

// FIM DO ALGORITMO DE ORDENAÇÃO BUBBLE SORT

        // Imprime o nome e a idade em ordem crescente
        for (int i = 0; i < idade.length; i++)
            System.out.println(nome[i] + " - " + idade[i]);
    }
}

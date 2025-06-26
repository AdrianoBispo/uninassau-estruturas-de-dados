package exercicios.lista02;

import java.util.Scanner;

/*
    Questão 02 - Crie um programa que receba os dados de dois vetores de 10 posições , um
    contendo o nome das cidades e outro contendo a população dessas cidades. Ordene os
    vetores por número de habitantes e mostre o vetor de forma decrescente de quantidades de habitantes.
*/

public class Questao02 {
    public static void main(String[] args) {

        Scanner ser = new Scanner(System.in);

        int[] popula = new int[10];
        String[] nome = new String[10];

        for (int i=0; i<popula.length; i++) {

            System.out.println("Digite o nome da cidade:");
            nome[i] = ser.nextLine();

            System.out.println("Digite a população da cidade:");
            popula[i] = ser.nextInt();

            ser.nextLine(); // Limpar Buffer
        }

        int out, in;
        int nElems = popula.length;
        int temp = 0;
        String temps = "";


        for(out=nElems-1; out>0; out--) // loop externo (trás para frente)
            for(in=0; in<out; in++) {// loop interno (em frente)
                if( popula[in] > popula[in+1] ) { // fora de ordem?
                    temp = popula[in];
                    popula[in] = popula[in+1];
                    popula[in+1] = temp;
                    temps = nome[in];
                    nome[in] = nome[in+1];
                    nome[in+1] = temps;
                }
            }


        for (int i=0; i<popula.length; i++)
            System.out.println(nome[i] + " - " + popula[i]);
    }
}

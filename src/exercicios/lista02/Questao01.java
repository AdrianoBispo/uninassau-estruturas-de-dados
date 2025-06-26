package exercicios.lista02;

import java.util.Scanner;

public class Questao01 {

    public static void Ordenacao_BubbleSort(double[ ] vetor) {
        int out, in;
        int nElems = vetor.length;
        double temp = 0;
        for(out=nElems-1; out>0; out--) { // loop externo (trás para frente)
            for(in=0; in<out; in++) {  // loop interno (em frente)
                if( vetor[in] > vetor[in+1] ) { // fora de ordem?
                    temp = vetor[in];
                    vetor[in] = vetor[in+1];
                    vetor[in+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner ser = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i=0; i < numeros.length; i++) {
            System.out.println("Digite o valor da compra:");
            numeros[i] = ser.nextDouble();
        }

        Ordenacao_BubbleSort(numeros);
        System.out.println("Vetor ordenado");

        for (int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        ser.close();

        System.out.println("Os três menores");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        System.out.println("Os três maiores");
        System.out.println(numeros[9]);
        System.out.println(numeros[8]);
        System.out.println(numeros[7]);
    }

}

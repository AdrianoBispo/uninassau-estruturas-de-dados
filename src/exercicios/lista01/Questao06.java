package exercicios.lista01;

// Questão 6: Crie um algoritmo que preencha uma matriz (10 X 10), utilizando as regras a seguir:
//  • Para Coluna maior que a linha = 2L+1
//  • Para Coluna igual à linha = 1
//  • Para Coluna menor que a linha = 2C + 3L

public class Questao06 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                if (c > l) {
                    matriz[l][c] = 2 * l + 1;
                } else if (c == l) {
                    matriz[l][c] = 1;
                } else {
                    matriz[l][c] = 2 * c + 3 * l;
                }
            }
        }

        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }
    }
}

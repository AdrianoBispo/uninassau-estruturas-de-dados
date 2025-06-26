package exercicios.lista01;

// Questão 7: Crie um algoritmo que preencha uma matriz (8 X 8), utilizando as regras a seguir:
//   • Para Coluna maior que a linha = 3C+4L
//   • Para Coluna igual à linha = 2
//   • Para Coluna menor que a linha = 2C + 3L

public class Questao07 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];

        for (int l = 0; l < 8; l++) {
            for (int c = 0; c < 8; c++) {
                if (c > l) {
                    matriz[l][c] = 3 * c + 4 * l;
                } else if (c == l) {
                    matriz[l][c] = 2;
                } else {
                    matriz[l][c] = 2 * c + 3 * l;
                }
            }
        }

        for (int l = 0; l < 8; l++) {
            for (int c = 0; c < 8; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }
    }
}


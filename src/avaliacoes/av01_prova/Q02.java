package avaliacoes.av01_prova;

/*
    Questão 7 – Crie um programa que preencha uma matriz quadrada 4 x 4 utilizando as seguintes condições.
    - a) Para elementos com o número da linha maior que o número da coluna use a formula 2*L;
    - b) Para os elementos da diagonal principal coloque 1;
    - c) Para elementos com o número da coluna maior que o número da linha use a Formula 2*L-3*C;
*/

public class Q02 {
    public static void main(String[] args) {
        int[][] quant = new int[4][4];

        for (int x = 0; x < quant.length; x++) {
            for (int y = 0; y < quant[x].length; y++) {
                if (x > y) {
                    quant[x][y] = x * 2;
                } else if (x == y) {
                    quant[x][y] = 1;
                } else {
                    quant[x][y] = (2 * x) - (3 * y);
                }
            }
        }

        // Impressão da matriz
        for (int x = 0; x < quant.length; x++) {
            for (int y = 0; y < quant[x].length; y++) {
                System.out.print(quant[x][y] + "\t");
            }
            System.out.println();
        }
    }
}

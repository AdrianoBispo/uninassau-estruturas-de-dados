package exercicios.lista01;

// Questão 5: Receba dois vetores um com o Nome do país, outro com a quantidade de
// pedidos, ordene de forma ascendente pela quantidade de pedidos.
// Imprima o vetor de forma ascendente.

public class Questao05 {
    public static void main(String[] args) {

        // Vetor de valores numéricos (por exemplo, alguma métrica de países)
        int[] valores = {130, 450, 460, 350, 500, 20, 35, 120, 230, 200};

        // Vetor de países correspondente aos valores acima
        String[] paises = {
                "Brasil", "Inglaterra", "USA", "México", "china",
                "Azerbajão", "Argentina", "França", "Italia", "Espanha"
        };

        // Bubble Sort para ordenar os valores em ordem crescente
        // e manter a associação correta com os países
        bubbleSortComNomes(valores, paises);

        // Impressão dos resultados ordenados
        exibirResultados(valores, paises);
    }

    // Método de ordenação Bubble Sort adaptado para dois vetores paralelos
    public static void bubbleSortComNomes(int[] numeros, String[] nomes) {
        int n = numeros.length;

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca os valores
                    int tempNumero = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = tempNumero;

                    // Troca os nomes de forma correspondente
                    String tempNome = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempNome;
                }
            }
        }
    }

    // Método para exibir o conteúdo final dos vetores
    public static void exibirResultados(int[] numeros, String[] nomes) {
        System.out.println("Países ordenados por valor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(nomes[i] + " - " + numeros[i]);
        }
    }
}

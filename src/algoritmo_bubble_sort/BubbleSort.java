package algoritmo_bubble_sort;

public class BubbleSort {

    // Metodo para realizar a ordenação utilizando o algoritmo Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Loop para passar por todos os elementos do array
        for (int i = 0; i < n - 1; i++) {
            // Flag para verificar se houve trocas durante a iteração
            boolean trocou = false;

            // Últimos elementos já estão na posição correta, por isso a redução do limite
            for (int j = 0; j < n - i - 1; j++) {
                // Compara elementos adjacentes e os troca se necessário
                if (arr[j] > arr[j + 1]) {
                    // Troca os elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    trocou = true;
                }
            }

            // Se não houve troca, o array já está ordenado
            if (!trocou) {
                break;
            }
        }
    }

    // Metodo para imprimir o array
    public static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Exemplo de uso do algoritmo Bubble Sort
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Array antes da ordenação:");
        imprimirArray(arr);

        bubbleSort(arr);

        System.out.println("Array após a ordenação:");
        imprimirArray(arr);
    }
}

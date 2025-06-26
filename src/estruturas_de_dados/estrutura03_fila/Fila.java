package estruturas_de_dados.estrutura03_fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Adicionando elementos à fila
        fila.add("apple");
        fila.add("banana");
        fila.add("cherry");

        System.out.println("Queue: " + fila); // Imprimindo elementos da fila

        // Remove o primeiro elemento da fila
        String front = fila.remove();

        System.out.println("Removed element: " + front); // Imprime elemento que foi removido da fila

        // Imprime fila atualizada
        System.out.println("Queue after removal: " + fila);

        // Adiciona o elemento no final da fila
        fila.add("date");

        // Pega e imprime o primeiro elemento da fila
        String peeked = fila.peek();
        System.out.println("Peeked element: " + peeked);

        // Imprime fila atualizada
        System.out.println("Queue after peek: " + fila);
    }
}

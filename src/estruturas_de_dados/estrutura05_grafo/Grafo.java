package estruturas_de_dados.estrutura05_grafo;

import java.util.LinkedList;
import java.util.List;

public class Grafo {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList<>();
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int from, int to) {
        adjacencyList.get(from).add(to);
        adjacencyList.get(to).add(from); // Para um grafo não-direcionado, adicione a aresta nos dois sentidos
    }

    public void display() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vértice " + i + ":");
            for (Integer vertex : adjacencyList.get(i)) {
                System.out.print(" " + vertex);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Grafo grafo = new Grafo(5);

        grafo.addEdge(0, 1);
        grafo.addEdge(0, 2);
        grafo.addEdge(1, 2);
        grafo.addEdge(2, 3);
        grafo.addEdge(3, 4);
        grafo.addEdge(4, 2);
        System.out.println("Lista de Adjacência do Grafo:");
        grafo.display();
    }
}

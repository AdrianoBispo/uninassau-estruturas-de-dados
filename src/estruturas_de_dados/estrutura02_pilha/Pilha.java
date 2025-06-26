package estruturas_de_dados.estrutura02_pilha;

import java.util.Stack;

// Exemplo de uma pilha em Java
public class Pilha {
    public static void main(String[] args) {
        System.out.println("-------------------Pilhas-------------------");

        // Criando a pilha
        Stack<String> pilha = new Stack<>();

        // Inserindo valores na pilha
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        // Pegando o topo da pilha
        System.out.println("Topo: " + pilha.peek());

        // Percorrendo a pilha
        for (int i = 0; i < pilha.size(); i++){
            System.out.println(pilha.get(i));
        }

        // Removendo um elemento, e por ser uma pilha, remove o último elemento inserido
        pilha.pop();

        System.out.println("Depois de remover um elemento:");

        // Percorrendo a pilha novamente
        for (int i = 0; i < pilha.size(); i++){
            System.out.println(pilha.get(i));
        }
    }
}

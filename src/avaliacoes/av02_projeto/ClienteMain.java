package avaliacoes.av02_projeto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ClienteMain {

    public static void main(String[] args) {

        // Caminho exato para o arquivo de clientes
        String caminhoArquivo = "./src/avaliacoes/av02_projeto/Clientes.txt";

        // --- Parte 1: Leitura e Armazenamento ---

        // a) Estruturas de dados para armazenar os clientes
        ArrayList<Regcli> listaClientes = new ArrayList<>();
        Stack<Regcli> pilhaPrimeirosClientes = new Stack<>();
        Queue<Regcli> filaUltimosClientes = new LinkedList<>(); // LinkedList implementa a interface Queue

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            int contadorLinhas = 0;

            // a) Leitura do arquivo, conversão para objeto e armazenamento
            while ((linha = br.readLine()) != null) {

                // Separa os dados da linha pelo delimitador ";"
                String[] dados = linha.split(";");
                if (dados.length == 3) {

                    // Cria o objeto Regcli com os dados lidos
                    Regcli cliente = new Regcli(dados[0].trim(), dados[1].trim(), dados[2].trim());

                    // Adiciona todos os clientes ao ArrayList
                    listaClientes.add(cliente);

                    // Adiciona os 10 primeiros à pilha
                    if (contadorLinhas < 10) {
                        pilhaPrimeirosClientes.push(cliente);
                    }
                    contadorLinhas++;
                }
            }

            // Adiciona os 10 últimos clientes do ArrayList à fila
            int totalClientes = listaClientes.size();
            if (totalClientes >= 10) {
                for (int i = totalClientes - 10; i < totalClientes; i++) {
                    filaUltimosClientes.add(listaClientes.get(i));
                }
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // --- Parte 2: Operações nas Estruturas ---

        // 1. Listar todos os elementos do ArrayList
        System.out.println("--- Lista de Todos os Clientes (ArrayList) ---");
        for (Regcli cliente : listaClientes) {
            System.out.println("País: " + cliente.getPais() + ", Nome: " + cliente.getNome());
        }

        // 2. Mostrar e desempilhar elementos da Pilha (Stack)
        System.out.println("\n--- Desempilhando os 10 Primeiros Clientes (Stack LIFO) ---");
        while (!pilhaPrimeirosClientes.isEmpty()) {
            Regcli cliente = pilhaPrimeirosClientes.pop(); // Remove e retorna o elemento do topo
            System.out.println("Desempilhado: " + cliente.getNome() + " (" + cliente.getPais() + ")");
        }

        // 3. Mostrar e remover elementos da Fila (Queue)
        System.out.println("\n--- Atendendo os 10 Últimos Clientes (Queue FIFO) ---");
        while (!filaUltimosClientes.isEmpty()) {
            Regcli cliente = filaUltimosClientes.poll(); // Remove e retorna o elemento da cabeça
            System.out.println("Atendido: " + cliente.getNome() + " (" + cliente.getPais() + ")");
        }
    }
}
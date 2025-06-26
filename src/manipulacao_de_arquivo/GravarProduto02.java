package manipulacao_de_arquivo;

import java.util.LinkedList;
import java.util.Queue;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// Gravar produto utilizando Fila
public class GravarProduto02 {
    public static void main(String[] args) {

        // Caminho exato do arquivo de produto
        String caminhoArquivo = "c:\\temp\\Produto.txt";

        // Cria a fila para armazenar objetos RegistrarProduto
        Queue<RegistrarProduto> fila = new LinkedList<>();

        // Adicione objetos RegistrarProduto à lista
        try {

            // Crie um objeto File para representar o arquivo
            File arquivo = new File(caminhoArquivo);

            // Crie um objeto Scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(arquivo);

            // Declaração das Variáveis que serão utilizadas no loop de leitura do arquivo
            int codigo = 0;
            String nome;
            String valores;
            double valor = 0;
            int quantidade = 0;
            int categoria = 0;

            // Loop para ler e imprimir cada linha do arquivo
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                codigo = Integer.parseInt(linha.substring(0, 2));
                nome = linha.substring(3, 34);
                valores = linha.substring(36, 41);
                valor = Double.parseDouble(valores);
                valor = valor / 100;
                quantidade = Integer.parseInt(linha.substring(43, 45));
                categoria = Integer.parseInt(linha.substring(46, 47));

                fila.add(new RegistrarProduto(codigo, nome, valor, quantidade, categoria));
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }

        // Remove os 4 últimos elementos da fila
        fila.remove();
        fila.remove();
        fila.remove();
        fila.remove();
        System.out.println("Depois de remover quatro elementos:");

        // Pecorre cada produto da fila e imprime suas informações
        for (RegistrarProduto produto : fila) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println();
        }
    }

}

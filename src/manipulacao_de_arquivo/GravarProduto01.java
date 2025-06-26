package manipulacao_de_arquivo;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// Gravar produto utilizando Lista
public class GravarProduto01 {
    public static void main(String[] args) {

        // Caminho exato do arquivo de produto
        String caminhoArquivo = "./src/manipulacao_de_arquivo/Produto.txt";

        // Crie um ArrayList para armazenar objetos RegistrarProduto
        ArrayList<RegistrarProduto> listaDeProdutos = new ArrayList<>();

        // Adicione objetos RegistrarProduto à lista
    	try {
            // Crie um objeto File para representar o arquivo
            File arquivo = new File(caminhoArquivo);

            // Crie um objeto Scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(arquivo);

            // Declaração das Variáveis que serão utilizadas no loop de leitura do arquivo
            int codigo=0;
            String nome;
            String valors;
            double valor=0;
            int qtd = 0;
            int categoria = 0;

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                codigo = Integer.parseInt(linha.substring(0,2));
                nome=linha.substring(3,34);
                valors=linha.substring(36,41);
                valor=Double.parseDouble(valors);
                valor = valor /100;
                qtd=Integer.parseInt(linha.substring(43,45));
                categoria=1;
                Integer.parseInt(linha.substring(46,47));
                listaDeProdutos.add(new RegistrarProduto(codigo,nome,valor,qtd,categoria));
            }    	
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }

        // Pecorre cada produto da lista e imprime suas informações
        for (RegistrarProduto produto : listaDeProdutos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println();
        }
    }

}

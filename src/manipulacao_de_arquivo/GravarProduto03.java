package manipulacao_de_arquivo;

import java.util.Stack;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// Gravar produto utilizando Pilha
public class GravarProduto03 {
    public static void main(String[] args) {

        // Caminho exato para acessar arquivo de produto
        String caminhoArquivo = "./src/manipulacao_de_arquivo/Produto.txt";

        Stack<RegistrarProduto> pilha = new Stack();

        // Adicione objetos RegistrarProduto à pilha
    	try {
            // Crie um objeto File para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            // Crie um objeto Scanner para ler o conteúdo do arquivo
            Scanner leitor = new Scanner(arquivo);
            // Scanner leia = new Scanner(System.in);
            // Use um loop para ler e imprimir cada linha do arquivo

            int codigo = 0;
            String nome;
            String valores;
            double valor = 0;
            int quantidade = 0;
            int categoria = 0;
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                codigo = Integer.parseInt(linha.substring(0,2));
                nome=linha.substring(3,34);
                valores=linha.substring(36,41);
                valor=Double.parseDouble(valores);
                valor = valor /100;
                quantidade=Integer.parseInt(linha.substring(43,45));
                categoria=Integer.parseInt(linha.substring(46,47));
                pilha.push(new RegistrarProduto(codigo,nome,valor,quantidade,categoria));
            }    	
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + caminhoArquivo);
        }
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        pilha.pop();
        System.out.println("Depois de remover cinco elementos:");
    	
    	// Acesse os objetos na pilha
        for (RegistrarProduto produto : pilha){
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println();
        }
    }
}


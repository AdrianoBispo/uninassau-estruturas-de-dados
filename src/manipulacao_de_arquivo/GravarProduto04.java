package manipulacao_de_arquivo;

import java.util.TreeSet;

public class GravarProduto04 {
    public static void main(String[] args) {

        // Criando uma árvore ordenada (TreeSet) de objetos do tipo RegistrarProduto
        TreeSet<RegistrarProduto> arvoreRegPdt = new TreeSet<>((o1, o2) -> {

            // Personalizando a comparação para ordenar por código
            if (o1.getCodigo() < o2.getCodigo()) {
                return -1;
            } else if (o1.getCodigo() > o2.getCodigo()) {
                return 1;
            } else {
                return 0;
            }
        });

        // Adicionando objetos à árvore
        arvoreRegPdt.add(new RegistrarProduto(2, "Produto 2", 15.75, 15, 2));
        arvoreRegPdt.add(new RegistrarProduto(1, "Produto 1", 10.5, 20, 1));
        arvoreRegPdt.add(new RegistrarProduto(3, "Produto 3", 20.0, 30, 1));
        arvoreRegPdt.add(new RegistrarProduto(4, "Produto 4", 18.25, 25, 3));
        arvoreRegPdt.add(new RegistrarProduto(5, "Produto 5", 22.50, 10, 2));
        arvoreRegPdt.add(new RegistrarProduto(6, "Produto 6", 12.99, 18, 3));
        arvoreRegPdt.add(new RegistrarProduto(7, "Produto 7", 30.75, 22, 1));
        arvoreRegPdt.add(new RegistrarProduto(8, "Produto 8", 27.40, 28, 2));


        // Exibindo detalhes dos produtos na árvore (ordenados por código)
        System.out.println("Detalhes dos produtos na árvore (ordenados por código):");
        for (RegistrarProduto produto : arvoreRegPdt) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println();
        }
    }
}


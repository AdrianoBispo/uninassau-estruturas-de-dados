package manipulacao_de_arquivo;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("### MENU ###");
            System.out.println("1. Mostrar lista de produtos"); // Chama a classe GravarProduto01
            System.out.println("2. Mostrar fila de produtos"); // Chama a classe GravarProduto02
            System.out.println("3. Mostrar pilha de produtos"); // Chama a classe GravarProduto03
            System.out.println("4. Mostrar árvore de produtos"); // Chama a classe GravarProduto04
            System.out.println("5. Sair do programa"); // Encerra o loop e o programa
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            switch (opcao) {
                case 1:
                    GravarProduto01.main(args);
                    break;
                case 2:
                    GravarProduto02.main(args);
                    break;
                case 3:
                    GravarProduto03.main(args);
                    break;
                case 4:
                    GravarProduto04.main(args);
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}

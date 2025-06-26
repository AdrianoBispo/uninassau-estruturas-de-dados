package algoritmos_recursivos;
import java.util.Scanner;

public class Fatorial {
    // Cria o objeto Scanner para ler a entrada do usuário
    static Scanner scan = new Scanner(System.in);

    // Metodo principal para calcular o fatorial
    public static void main(String[] args){
        System.out.println("digite um numero inteiro para calculo: ");
        int base = scan.nextInt();
        System.out.println("O fatorial de " +base+ " é: " + fatorial(base));
    }

    static int fatorial(int b){
        if (b==0){
            return 1;
        }
        else {
            System.out.println(b+ " - " +(b-1));
            return (fatorial(b-1)*b);
        }
    }

}

/*

funcao Fatorial (N: inteiro): inteiro
inicio

    se N = 0 então
        return 1

    senao
        return N * Fatorial(N-1)

    fimse

    F(4) = 4.F(4-1)
      F(3) = 3.F(3-1)
        F(2) = 2.F(2-1)
          F(1) = 1.F(1-1)
              F(0) = 1 ---- Caso Base
          F(1) = 1.F(1-1)
        F(2) = 2.F(2-1)
      F(3) = 3.F(3-1)
    F(4) = 4.F(4-1)


*/

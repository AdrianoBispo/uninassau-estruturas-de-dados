package algoritmos_recursivos;
import java.util.Scanner;

public class SomatoriaRecursiva {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("digite um numero inteiro para calculo: ");
        int base = scan.nextInt();
        System.out.println("O fatorial de " +base+ " é: " + fatorial(base));
    }

    static long fatorial(long b){
        if (b==0){
            return 1;
        }
        else {
            System.out.println(b+ " - " +(b-1));
            return (fatorial(b-1)*b);
        }
    }

}

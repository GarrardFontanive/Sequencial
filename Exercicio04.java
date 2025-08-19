package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        for(int i=1;i<=4;i++){
            System.out.print("Nota " + i + ": ");
            soma += sc.nextDouble();
        }
        System.out.println("Media = " + (soma/4));
        sc.close();
    }
}
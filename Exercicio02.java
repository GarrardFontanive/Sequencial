package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        System.out.println("O numero informado foi " + num);
        sc.close();
    }
}
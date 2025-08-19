package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = sc.nextDouble();
        System.out.println("Soma = " + (n1 + n2));
        sc.close();
    }
}
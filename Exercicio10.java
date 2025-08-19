package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro inteiro: ");
        int a = sc.nextInt();
        System.out.print("Segundo inteiro: ");
        int b = sc.nextInt();
        System.out.print("Numero real: ");
        double c = sc.nextDouble();
        System.out.println("a) " + (2*a*(b/2.0)));
        System.out.println("b) " + (3*a + c));
        System.out.println("c) " + (Math.pow(c,3)));
        sc.close();
    }
}
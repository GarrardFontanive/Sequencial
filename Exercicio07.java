package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lado do quadrado: ");
        double lado = sc.nextDouble();
        System.out.println("Area = " + (lado*lado));
        sc.close();
    }
}
package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura: ");
        double h = sc.nextDouble();
        System.out.println("Peso ideal = " + ((72.7*h) - 58));
        sc.close();
    }
}
package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) / 1.8;
        System.out.println("Celsius = " + c);
        sc.close();
    }
}
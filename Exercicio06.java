package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Raio do circulo: ");
        double r = sc.nextDouble();
        System.out.println("Area = " + (Math.PI*r*r));
        sc.close();
    }
}
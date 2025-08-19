package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura: ");
        double h = sc.nextDouble();
        System.out.println("Homem: " + ((72.7*h)-58));
        System.out.println("Mulher: " + ((62.1*h)-44.7));
        sc.close();
    }
}
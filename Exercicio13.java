package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso de peixes: ");
        double p = sc.nextDouble();
        double excesso = Math.max(0, p-50);
        double multa = excesso * 4;
        System.out.println("Excesso: " + excesso);
        System.out.println("Multa: " + multa);
        sc.close();
    }
}
package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Area: ");
        double area = sc.nextDouble();
        double litros = area / 6.0;
        double latas = Math.ceil(litros/18);
        double galoes = Math.ceil(litros/3.6);
        System.out.println("So latas: " + (int)latas + " - Preco: " + (latas*80));
        System.out.println("So galoes: " + (int)galoes + " - Preco: " + (galoes*25));
        sc.close();
    }
}
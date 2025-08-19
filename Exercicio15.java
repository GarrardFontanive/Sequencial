package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Area: ");
        double area = sc.nextDouble();
        double litros = area / 3.0;
        double latas = Math.ceil(litros/18);
        double preco = latas * 80;
        System.out.println("Latas: " + (int)latas);
        System.out.println("Preco: " + preco);
        sc.close();
    }
}
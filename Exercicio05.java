package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Metros: ");
        double m = sc.nextDouble();
        System.out.println(m + " metros = " + (m*100) + " centimetros");
        sc.close();
    }
}
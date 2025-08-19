package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ganho por hora: ");
        double gh = sc.nextDouble();
        System.out.print("Horas no mes: ");
        double h = sc.nextDouble();
        System.out.println("Salario = " + (gh*h));
        sc.close();
    }
}
package exercicios.sequenciais;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ganho por hora: ");
        double gh = sc.nextDouble();
        System.out.print("Horas no mes: ");
        double h = sc.nextDouble();
        double bruto = gh*h;
        double ir = bruto*0.11;
        double inss = bruto*0.08;
        double sind = bruto*0.05;
        double liquido = bruto - ir - inss - sind;
        System.out.println("Bruto: " + bruto);
        System.out.println("IR: " + ir);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sind);
        System.out.println("Liquido: " + liquido);
        sc.close();
    }
}
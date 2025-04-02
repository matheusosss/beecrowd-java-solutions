import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double imposto = 0.0;

        if (salario > 2000.00) {
            if (salario <= 3000.00) {
                imposto += (salario - 2000.00) * 0.08;
            } else if (salario <= 4500.00) {
                imposto += (1000.00 * 0.08);
                imposto += (salario - 3000.00) * 0.18;
            } else {
                imposto += (1000.00 * 0.08);
                imposto += (1500.00 * 0.18);
                imposto += (salario - 4500.00) * 0.28;
            }
            System.out.printf("R$ %.2f%n", imposto);
        } else {
            System.out.println("Isento");
        }

        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double percentual;
        double reajuste;

        if (salario <= 400.00) {
            percentual = 0.15;
        } else if (salario <= 800.00) {
            percentual = 0.12;
        } else if (salario <= 1200.00) {
            percentual = 0.10;
        } else if (salario <= 2000.00) {
            percentual = 0.07;
        } else {
            percentual = 0.04;
        }

        reajuste = salario * percentual;
        salario += reajuste;

        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %.0f %%\n", percentual * 100);

        sc.close();
    }
}

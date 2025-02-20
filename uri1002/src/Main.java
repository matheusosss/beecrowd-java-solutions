import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, A, n, AQ;

        n = 3.14159;
        raio = sc.nextDouble();
        A = Math.pow(raio, 2) * n;

        System.out.printf("A=%.4f\n", A);

        sc.close();
    }
}
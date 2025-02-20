import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int numfun, hrtrab;
        double valperhr, salario;

        numfun = sc.nextInt();
        hrtrab = sc.nextInt();
        valperhr = sc.nextDouble();
        salario = valperhr * hrtrab;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numfun, salario);
        sc.close();
    }
}
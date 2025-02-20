import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Formula de Bhaskara
        Scanner sc = new Scanner(System.in);
        Double A, B, C, R1, R2, bhaskara, delta, x;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        delta = B * B - 4.0 * A * C;

        if (delta < 0 || A == 0){
            System.out.println("Impossível calcular");
        } else {
            R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
            R2 = (-B - Math.sqrt(delta)) / (2.0 * A);

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);

        }

        sc.close();
    }
}
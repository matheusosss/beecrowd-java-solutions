import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double A, B, C, P1, P2, P3, MEDIA;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        P1 = 2;
        P2 = 3;
        P3 = 5;
        MEDIA = ((A*P1) + (B*P2) + (C*P3)) / (P1 + P2 + P3);
        System.out.printf("MEDIA = %.1f\n", MEDIA);


        sc.close();

    }

}
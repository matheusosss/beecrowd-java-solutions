import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double a, b, media, peso1, peso2;
        peso1 = 3.5;
        peso2 = 7.5;
        a = sc.nextDouble();
        b = sc.nextDouble();
        media = ((a * peso1) + (b * peso2))/(peso1 + peso2);
        System.out.printf("MEDIA = %.5f\n", media);

        sc.close();

    }

}
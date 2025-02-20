import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a, b, PROD;

        a = sc.nextInt();
        b = sc.nextInt();
        PROD = a * b;
        System.out.println("PROD = " + PROD);

        sc.close();

    }

}
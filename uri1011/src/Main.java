import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Double pi, raio, volume;

        raio = sc.nextDouble();
        pi = 3.14159;
        volume = (4/3.0) * pi * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();


    }

}
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int distancia;
        Double combTotalGasto, consumo;

        distancia = sc.nextInt();
        combTotalGasto = sc.nextDouble();
        consumo = distancia/combTotalGasto;

        System.out.printf("%.3f km/l\n", consumo);

        sc.close();

    }

}
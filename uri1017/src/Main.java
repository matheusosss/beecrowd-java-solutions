import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Double tempo, velocidadeMedia, combustivel, distanciaPercorrida;

        tempo = sc.nextDouble();
        velocidadeMedia = sc.nextDouble();
        distanciaPercorrida = velocidadeMedia * tempo;
        combustivel = distanciaPercorrida/12;

        System.out.printf("%.3f\n", combustivel);
        sc.close();

    }

}
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int dist, velocidade, tempo;
        dist = sc.nextInt();
        tempo = 2 * dist;

        System.out.println(tempo + " minutos");
        sc.close();

    }

}
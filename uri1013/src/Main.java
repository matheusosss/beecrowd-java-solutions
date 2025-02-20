import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a, b, c, maiorAB, maior;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Calcula o maior entre a e b
        maiorAB = (a + b + Math.abs(a - b)) / 2;

        // Calcula o maior entre maiorAB e c
        maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        // Imprime o resultado correto
        System.out.println(maior + " eh o maior");

        sc.close();
    }
}

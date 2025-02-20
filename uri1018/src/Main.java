import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int valorInteiro, umReal, doisReais, cincoReais, dezReais, vinteReais, cinquentaReais, cemReais, resto;

        valorInteiro = sc.nextInt();

        cemReais = valorInteiro / 100;
        resto = valorInteiro % 100;

        cinquentaReais = resto / 50;
        resto = resto % 50;

        vinteReais = resto / 20;
        resto = resto % 20;

        dezReais = resto / 10;
        resto = resto % 10;

        cincoReais = resto / 5;
        resto = resto % 5;

        doisReais = resto / 2;
        umReal = resto % 2;

        System.out.println(valorInteiro);
        System.out.println(cemReais + " nota(s) de R$ 100,00");
        System.out.println(cinquentaReais + " nota(s) de R$ 50,00");
        System.out.println(vinteReais + " nota(s) de R$ 20,00");
        System.out.println(dezReais + " nota(s) de R$ 10,00");
        System.out.println(cincoReais + " nota(s) de R$ 5,00");
        System.out.println(doisReais + " nota(s) de R$ 2,00");
        System.out.println(umReal + " nota(s) de R$ 1,00");

        sc.close();

    }

}
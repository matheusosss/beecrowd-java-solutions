import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int idadeEmDias, resto, dias, meses, anos;

        idadeEmDias = sc.nextInt();
        anos = idadeEmDias / 365;
        resto = idadeEmDias % 365;
        meses = resto / 30;
        dias = resto % 30;

        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");

        sc.close();
    }

}
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
        Double valorPeca1, valorPeca2, valorTotal1, valorTotal2, valor;

        codigoPeca1 = sc.nextInt();
        numeroPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorTotal1 = valorPeca1 * numeroPeca1;
        valorTotal2 = valorPeca2 * numeroPeca2;
        valor = valorTotal1 + valorTotal2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor);

        sc.close();

    }

}
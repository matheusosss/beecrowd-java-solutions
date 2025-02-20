import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String nome;
        Double salario, comissao, totalDeVendas, salarioComissionado;

        nome = sc.next();
        salario = sc.nextDouble();
        totalDeVendas = sc.nextDouble();
        comissao = totalDeVendas * 15 / 100;
        salarioComissionado = salario + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", salarioComissionado);

        sc.close();





    }

}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double codigo1, codigo2, codigo3, codigo4, codigo5, precoFinal;


        System.out.println("Escolha seu produto à partir do código [1, 2, 3, 4 e 5]: ");
        int produto = sc.nextInt();
        System.out.println("Agora digite a quantidade: ");
        int qntdProduto = sc.nextInt();

        codigo1 = 4.0;
        codigo2 = 4.5;
        codigo3 = 5.0;
        codigo4 = 2.0;
        codigo5 = 1.5;

        if (produto == 1){
            precoFinal = qntdProduto * codigo1;
            System.out.printf("Total: R$ %.2f\n", precoFinal);
        } else if (produto == 2) {
            precoFinal = qntdProduto * codigo2;
            System.out.printf("Total: R$ %.2f\n", precoFinal);
        } else if (produto == 3) {
            precoFinal = qntdProduto * codigo3;
            System.out.printf("Total: R$ %.2f\n", precoFinal);
        } else if (produto == 4) {
            precoFinal = qntdProduto * codigo4;
            System.out.printf("Total: R$ %.2f\n", precoFinal);
        } else if (produto == 5){
            precoFinal = qntdProduto * codigo5;
            System.out.printf("Total: R$ %.2f\n", precoFinal);
        }
        sc.close();
    }
}
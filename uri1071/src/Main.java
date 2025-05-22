import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y, min, max;

        X = sc.nextInt();
        Y = sc.nextInt();

        if (X < Y){
            min = X;
            max = Y;
        } else {
            min = Y;
            max = X;
        }

        int soma = 0;
        for (int i = min + 1; i < max; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
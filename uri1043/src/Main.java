import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            Double A, B, C, perimetro, area;

            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();

            if (A + B > C && A + C > B && B + C > A){
                perimetro = A + B + C;
                System.out.println("Area = " + perimetro);
            } else {
                area = ((A + B) * C) / 2;
                System.out.println("Perimetro = " + area);
            }

        sc.close();
    }
}
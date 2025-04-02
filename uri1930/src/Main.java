import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T1, T2, T3, T4;

        T1 = sc.nextInt();
        T2 = sc.nextInt();
        T3 = sc.nextInt();
        T4 = sc.nextInt();

        if (T1 >= 2 && T1 <= 6 && T2 >= 2 && T2 <= 6 && T3 >= 2 && T3 <= 6 && T4 >= 2 && T4 <= 6){
            int maximoAparelhos = (T1 - 1) + (T2 -1) + (T3 - 1) + T4;
            System.out.println(maximoAparelhos);
        }

        sc.close();
    }
}
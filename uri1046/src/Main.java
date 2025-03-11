import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, dia, duracao;

        inicio = sc.nextInt();
        fim = sc.nextInt();
        dia = 24;

        if (inicio > 24 || fim > 24 || inicio < 0 || fim < 0){
            System.out.println("Valor inválido");
        }
        if (inicio > fim){
            duracao = dia - inicio + fim;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (fim > inicio) {
            duracao = fim - inicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else if (inicio == fim) {
            duracao = dia - fim + inicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        sc.close();
    }
}
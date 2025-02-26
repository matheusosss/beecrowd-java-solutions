import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        String dia;

        if (x == 1){
            dia = "domingo";
        } else if (x == 2) {
            dia = "segunda-feira";
        } else if (x == 3) {
            dia = "terça-feira";
        } else if (x == 4){
            dia = "quarta-feira";
        } else if (x == 5) {
            dia = "quinta-feira";
        } else if (x == 6) {
            dia = "sexta-feira";
        } else if (x == 7) {
            dia = "sábado";
        } else {
            dia = "Valor inválido";
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
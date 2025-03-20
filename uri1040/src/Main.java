import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double n1, n2, n3, n4, media, mediaRec, notaExame;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 4.0) + (n4 * 1.0)) / 10.0;
        media = Math.floor(media * 10) / 10.0;

        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
            notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            mediaRec = (notaExame + media) / 2.0;
            if (mediaRec >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", mediaRec);
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
        sc.close();
    }
}
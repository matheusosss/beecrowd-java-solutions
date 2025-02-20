import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Double valorA, valorB, valorC, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi;

        valorA = sc.nextDouble();
        valorB = sc.nextDouble();
        valorC = sc.nextDouble();

        pi = 3.14159;

        areaTriangulo = (valorA * valorC) / 2;
        areaCirculo = pi * Math.pow(valorC, 2);
        areaTrapezio = ((valorA + valorB) * valorC) / 2;
        areaQuadrado = valorB * valorB;
        areaRetangulo = valorA * valorB;


        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        sc.close();

    }

}
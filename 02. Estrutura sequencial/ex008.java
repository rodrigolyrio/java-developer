import java.util.Scanner;
import java.util.Locale;

public class ex008 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Medida A: ");
        double medidaA = leitor.nextDouble();

        System.out.printf("Medida B: ");
        double medidaB = leitor.nextDouble();

        System.out.printf("Medida C: ");
        double medidaC = leitor.nextDouble();

        double areaQuadrado = Math.pow(medidaA, 2);
        double areaTriangulo = (medidaA * medidaB) / 2;
        double areaTrapezio = (medidaA + medidaB) * medidaC / 2;

        System.out.printf("Área do Quadrado: %.4f \n", areaQuadrado);
        System.out.printf("Área do Triângulo: %.4f \n", areaTriangulo);
        System.out.printf("Área do Trapézio: %.4f \n", areaTrapezio);

        leitor.close();
    }
}

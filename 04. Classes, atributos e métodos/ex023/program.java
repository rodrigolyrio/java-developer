package ex023;

import java.util.Scanner;
import java.util.Locale;
import ex023.Rectangle;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();

        System.out.println("Insira os dados do Retangulo: ");
        System.out.print("Altura: ");
        retangulo.height = leitor.nextDouble();

        System.out.print("Largura: ");
        retangulo.width = leitor.nextDouble();

        System.out.printf("\nAREA = %.2f\n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f\n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", retangulo.diagonal());

        leitor.close();
    }
}

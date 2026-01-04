import java.util.Scanner;
import java.util.Locale;

public class ex005 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor do raio do circulo: ");
        double raio = leitor.nextDouble();
        leitor.nextLine();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("O valor da Área do círculo é %.3f", area);

        leitor.close();
    }
}
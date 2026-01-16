import java.util.Locale;
import java.util.Scanner;

public class ex016 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite as três distâncias: ");

        double maior = 0;

        for (int n = 0; n < 3; n++) {
            double distancia = leitor.nextDouble();
            maior = Math.max(distancia, maior);
        }

        System.out.printf("MAIOR DISTÂNCIA = %.2f", maior);

        leitor.close();
    }
}

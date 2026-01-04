import java.util.Scanner;
import java.util.Locale;

public class ex007 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Distancia total (em km): ");
        double distancia = leitor.nextDouble();

        System.out.printf("Total de combustivel gasto: ");
        double combustivel = leitor.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.printf("O consumo médio foi de %.3f", consumoMedio);

        leitor.close();
    }
}
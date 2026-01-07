import java.util.Scanner;
import java.util.Locale;

public class ex010 {
    static void main(String[] args) {
     Locale.setDefault(Locale.US);
     Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = leitor.nextDouble();

        double soma = primeiraNota + segundaNota;

        System.out.printf("NOTA FINAL = %.1f\n", soma);

        if (soma < 60)
            System.out.print("REPROVADO.");

        leitor.close();
    }
}


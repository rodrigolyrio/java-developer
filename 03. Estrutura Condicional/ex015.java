import java.util.Locale;
import java.util.Scanner;

public class ex015 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite a medida da glicose: ");
        double glicose = leitor.nextDouble();

        if (glicose <= 100)
            System.out.printf("Classificação: normal");
        else if (glicose > 100 && glicose <= 140) {
            System.out.printf("Classificação: elevado");
        } else
            System.out.printf("Classificação: diabetes");

        leitor.close();
    }
}

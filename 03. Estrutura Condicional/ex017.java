import java.util.Locale;
import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        char escala = leitor.next().charAt(0);

        if (escala == 'C') {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = leitor.nextDouble();
            double calculo = (double) (celsius * 9 / 5) + 32;
            System.out.printf("Temperatura equivalente em FAHRENHEIT = %.2f", calculo);
        }
        else {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = leitor.nextDouble();
            double calculo = (fahrenheit - 32) * ((double) 5 / 9);
            System.out.printf("Temperatura equivalente em CELSIUS = %.2f", calculo);
        }

        leitor.close();
    }
}

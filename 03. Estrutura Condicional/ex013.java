import java.util.Locale;
import java.util.Scanner;

public class ex013 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = leitor.nextInt();

        double valor = 50;

        if (minutos <= 100)
            System.out.printf("Valor a pagar: R$ %.2f", valor);
        else {
            int acrescimo = (minutos - 100) * 2;
            System.out.printf("Valor a pagar: R$ %.2f", (valor + acrescimo));
        }
        leitor.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int codigo = leitor.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = leitor.nextInt();

        double valor = 0;

        switch (codigo) {
            case (1):
                valor = 5;
                break;
            case (2):
                valor = 3.5;
                break;
            case (3):
                valor = 4.8;
                break;
            case (4):
                valor = 8.9;
                break;
            case (5):
                valor = 7.32;
                break;
        }

        double preco = valor * quantidade;

        System.out.printf("Valor a pagar: R$ %.2f", preco);
        
        leitor.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ex014 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = leitor.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = leitor.nextInt();

        System.out.print("Dinheiro recebido: ");
        double recebido = leitor.nextDouble();

        double troco = recebido - (preco * quantidade);

        if (troco > 0)
            System.out.printf("TROCO = %.2f\n", troco);
        else
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f", Math.abs(troco));

        leitor.close();
    }
}

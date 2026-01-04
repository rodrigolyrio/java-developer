import java.util.Scanner;
import java.util.Locale;

public class ex004 {
// Fazer programa para calcular o troco no processo de pagamento de um produto de uma mercearia. Ler preço unitário, quantidade e dinheiro recebido.
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Preço unitário: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Quantidade do produto: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        System.out.printf("Valor recebido: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        double troco = (double) valor - (preco * quantidade);
        System.out.printf("O Troco é R$%.2f", troco);

        sc.close();
    }

}

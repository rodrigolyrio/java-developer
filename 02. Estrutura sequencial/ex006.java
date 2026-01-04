import java.util.Locale;
import java.util.Scanner;

public class ex006 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome do funcionário: ");
        String nome = leitor.nextLine();

        System.out.printf("Valor a receber por hora: ");
        double valor = leitor.nextDouble();
        leitor.nextLine();

        System.out.printf("Horas trabalhadas pelo funcionário: ");
        int horasTrabalhadas = leitor.nextInt();
        leitor.nextLine();

        double total = valor * horasTrabalhadas;
        System.out.printf("O pagamento para %s deve se %.2f", nome, total);

        leitor.close();
    }
}

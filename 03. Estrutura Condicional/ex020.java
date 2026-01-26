import java.util.Locale;
import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salário da pessoa = ");
        double salario = leitor.nextDouble();

        double porcentagem = 0.0;

        if (salario <= 1000) {
            porcentagem = 0.2;
        } else if (salario <= 3000) {
            porcentagem = 0.15;
        } else if (salario <= 8000) {
            porcentagem = 0.1;
        } else if (salario > 8000) {
            porcentagem = 0.05;
        }

        double novoSalario =  (salario * porcentagem) + salario;

        System.out.printf("Novo salário = R$ %.2f\n", novoSalario);

        double aumento = novoSalario - salario;

        System.out.printf("Aumento = R$ %.2f\n", aumento);

        System.out.printf("Porcentagem = %.1f%%", porcentagem * 100);

        leitor.close();
    }
}

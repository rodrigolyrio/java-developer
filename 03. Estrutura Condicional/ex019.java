import java.util.Locale;
import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite dois numeros inteiros abaixo: ");
        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        if ((numero1 % numero2) == 0 || (numero2 % numero1) == 0)
            System.out.printf("São Multiplos!");
        else
            System.out.printf("Não são Multiplos!");

        leitor.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class ex012 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int primeiro = leitor.nextInt();
        int menor = primeiro;

        System.out.print("Segundo valor: ");
        int segundo = leitor.nextInt();
        menor = segundo < menor ? segundo : menor;

        System.out.print("Terceiro valor: ");
        int terceiro = leitor.nextInt();
        menor = terceiro < menor ? terceiro : menor;

        System.out.printf("MENOR: %d", menor);
        leitor.close();
    }
}

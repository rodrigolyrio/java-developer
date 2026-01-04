import java.util.Locale;
import java.util.Scanner;

public class ex003 {
// Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os nomes e a idade média entre pessoas, com uma casa decimal.
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome 1º pessoa: ");
        String primeiraPessoa = sc.nextLine();

        System.out.print("Idade 1º pessoa: ");
        int primeiraIdade = sc.nextInt();
        sc.nextLine(); // Limpeza de buffer

        System.out.print("Nome 2º pessoa: ");
        String segundaPessoa = sc.nextLine();

        System.out.print("Idade 2º pessoa: ");
        int segundaIdade = sc.nextInt();
        sc.nextLine(); // Limpeza de buffer

        double mediaIdades = (double) (primeiraIdade + segundaIdade) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", primeiraPessoa, segundaPessoa, mediaIdades);

        sc.close();
    }
}

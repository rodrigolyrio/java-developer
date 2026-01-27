import java.util.Locale;
import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Hora inicial: ");
        int horainicial = leitor.nextInt();

        System.out.print("Hora final: ");
        int horafinal = leitor.nextInt();

        if (horainicial < horafinal) {
            int duracao = horafinal - horainicial;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        } else {
            int duracao = 24 - (horainicial - horafinal);
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }

        leitor.close();
    }
}

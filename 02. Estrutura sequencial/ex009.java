import java.util.Scanner;
import java.util.Locale;

public class ex009 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Duração do tempo (em segundos): ");
        int duracao = leitor.nextInt();

        int horas = duracao / 3600; // 1h = 3600s
        int resto = duracao % 3600; // restante = minutos que não completam horas

        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.printf("%d:%d:%d", horas, minutos, segundos);

        leitor.close();
    }
}

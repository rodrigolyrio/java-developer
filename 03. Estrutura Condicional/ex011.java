import java.util.Locale;
import java.util.Scanner;

public class ex011 {
    static void main(String[] args) {
      
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Coeficiente a: ");
        double a = leitor.nextDouble();

        System.out.printf("Coeficiente b: ");
        double b = leitor.nextDouble();

        System.out.printf("Coeficiente c: ");
        double c = leitor.nextDouble();

        double delta = (Math.pow(b, 2) - (4 * a * c));

        if (delta < 0)
            System.out.println("Esta equação não possui raízes");
          
        else {
            double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.printf("X1 = %.4f\n", x1);
            System.out.printf("X2 = %.4f\n", x2);
        }

        leitor.close();
    }
}

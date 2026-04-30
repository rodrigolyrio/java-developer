package ex024;

import java.util.Locale;
import java.util.Scanner;
import ANKI.Employee;

public class Program{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.print("Nome: ");
        funcionario.name = leitor.nextLine();

        System.out.print("Salário bruto: ");
        funcionario.grossSalary = leitor.nextDouble();

        System.out.print("Imposto: ");
        funcionario.tax = leitor.nextDouble();

        System.out.printf("Funcionário: %s \nSalário: %.2f\n", funcionario.name, funcionario.NetSalary());

        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double porcentagem  = leitor.nextDouble();
        funcionario.IncreaseSalary(porcentagem);

        System.out.printf("Dados atualizados: %s \nSalario: %.2f", funcionario.name, funcionario.NetSalary());

        leitor.close();
    }
}

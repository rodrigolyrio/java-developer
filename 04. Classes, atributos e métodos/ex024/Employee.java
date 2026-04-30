package ex024;

public class Employee {

    String name;
    double grossSalary, tax;

    public double NetSalary() {
        return grossSalary - tax;
    };

    public void IncreaseSalary(double percentage) {
        double increase = grossSalary * (percentage / 100);
        grossSalary = grossSalary + increase;
    };
}

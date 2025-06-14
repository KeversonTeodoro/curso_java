package programacaoobjetos.exercicios.exercicio2;

import programacaoobjetos.exercicios.exercicio2.model.Employee;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner input = new Scanner(System.in);

        System.out.print("Insert employee name: ");
        employee.name = input.nextLine();

        System.out.print("Inert employee wage: ");
        employee.wage = input.nextLong();

        System.out.println("Inert the tax: ");
        employee.tax = input.nextDouble();

        System.out.println("Gross Salary of " + employee.name + " is " + employee.netSalary());

        System.out.println("Inert porcentage for update salary of " + employee.name);
        int porcentage = input.nextInt();
        employee.increaseSlary(porcentage);

        System.out.println("Wage updated");
        System.out.println(employee.netSalary());





    }
}

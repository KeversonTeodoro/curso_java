package heranca_e_polimorfismo.exercicios.exerciciovideo;
import heranca_e_polimorfismo.exercicios.exerciciovideo.model.Employee;
import heranca_e_polimorfismo.exercicios.exerciciovideo.model.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioVideoApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter employee number: ");
        int numberEmplooyee = input.nextInt();

        for (int i = 0; i < numberEmplooyee; i++) {

            System.out.print("Employee data " + i + ":");
            System.out.print("Outsourced (y/n)? ");
            char questOutSourced = input.next().charAt(0);

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Hours: ");
            int hours = input.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();

            if(questOutSourced == 'y'){
                System.out.print("Adicional charge: ");
                double adicionalCharge = input.nextDouble();
                Employee employee = new OutSourcedEmployee(name, hours, valuePerHour, adicionalCharge);
                employees.add(employee);
            }

            else{

                employees.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println("PAYMENTS: ");
        for(Employee funcionario : employees){
            System.out.println(funcionario.getName() + " - " + "$" + String.format("%.2f", funcionario.payment()) );
        }




        input.close();

    }
}

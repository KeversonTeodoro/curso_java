package enumeracoes.exercicios.contratos.application;
import enumeracoes.exercicios.contratos.entities_enum.WorkerLevel;
import enumeracoes.exercicios.contratos.model.Departament;
import enumeracoes.exercicios.contratos.model.HourContract;
import enumeracoes.exercicios.contratos.model.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ContratosApplication {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat forms = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament("Design"));

        System.out.print("How many contracts to this worker? ");
        int contractNumber = sc.nextInt();


        for (int i = 0; i < contractNumber; i++) {

            System.out.print("Enter contract #" + i + " data: ");
            System.out.println("Date (dd/MM/yyyy)");
            Date contractDate = forms.parse(sc.next());

            System.out.print("Enter value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (Hour): ");
            int duration = sc.nextInt();
            HourContract hourContract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(hourContract);


        }
        System.out.println();

        System.out.print("Enter month and year  to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();


    }
}

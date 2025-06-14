package programacaoobjetos.exercicios.exercicio3;

import programacaoobjetos.exercicios.exercicio3.model.Student;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner input = new Scanner(System.in);

        student.name = input.nextLine();
        student.notaSemestre1 = input.nextDouble();
        student.notaSemestre2 = input.nextDouble();
        student.notaSemestre3 = input.nextDouble();

        if(student.showFinalGrade() >= 60){
            System.out.println("PASS");
        }
        else{

            System.out.println("FAILED");
            System.out.println(student.missing());
        }


    }

}

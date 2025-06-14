package arrays.vetores1_e_2.exercicios.pensionato;

import arrays.vetores1_e_2.exercicios.pensionato.model.Lanches;
import arrays.vetores1_e_2.exercicios.pensionato.model.Quarto;
import arrays.vetores1_e_2.exercicios.pensionato.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PensionatoAplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student student1 = new Student("Pedro ", "PedroGamer@gmail.com");
        Pensionato pensionatos = new Pensionato();
        Quarto quarto1 = new Quarto();

        pensionatos.addStudent(student1);
        pensionatos.ocuparQuarto(quarto1);

        Lanches sanduiche = new Lanches("Sanduiche Natural", 12.00);
        Lanches coca = new Lanches("Coca-cola", 6.00);
        Lanches agua = new Lanches("Água mineral", 5.00);

        quarto1.adicionarLanche(sanduiche);
        quarto1.adicionarLanche(coca);
        quarto1.adicionarLanche(agua);


        quarto1.adicionarStudent(student1);

        quarto1.consumirLanche(coca);
        quarto1.consumirLanche(sanduiche);


        System.out.println("O estudante " + quarto1.getStudentsQuarto() + "gastou " + quarto1.getGasto() + " reais");


//        System.out.println(quarto.getGeladeira());
//        System.out.println(quarto.getStudentsQuarto());
//        System.out.println(quarto.getGasto());



    }

    public static class Pensionato {
        List<Student> Student;
        List<Quarto> Quarto;

        List<Student> students = new ArrayList<>();
        List<Quarto> quartos = new ArrayList<>();

        void addStudent(Student student){
            students.add(student);
        }
        void removeStudent(Student student){
            students.remove(student);
        }

        void ocuparQuarto(Quarto quarto){
            quartos.add(quarto);

        }

        void desocuparQuarto(Quarto quarto){
            quartos.remove(quarto);
        }


    }
}

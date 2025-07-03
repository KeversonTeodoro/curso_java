package generics_set_map.exercicios.exercicio_curso;

import generics_set_map.exercicios.exercicio_curso.model.entitie.Aluno;
import generics_set_map.exercicios.exercicio_curso.model.entitie.Course;
import generics_set_map.exercicios.exercicio_curso.model.entitie.Instrutor;

import java.text.ParseException;
import java.util.*;

public class CursoApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Set<Course> cursosDoInstrutorAlex = new HashSet<>();
        Instrutor alex = new Instrutor("Alex", cursosDoInstrutorAlex);



//        alex.curs.add(new Course("Dados"));

        // adicionando dados na lista de curso do instrutor do curso
        // estou passando apenas o nome sem a lista de alunos desse curso, então quando printar
        // o valor da lista ficara nulo, pois não instanciei nada



        cursosDoInstrutorAlex.add(new Course("Dados", new HashSet<>()));
        cursosDoInstrutorAlex.add(new Course("Design Thinking", new HashSet<>()));
        alex.getListaDeCursosDoInstrutor().add(new Course("PHP", new HashSet<>()));



        for(Course curso : alex.getListaDeCursosDoInstrutor()){
            System.out.print("How many studants for a curse: " + curso.getName() + "? ");
            int numeroDeAlunosDoCurso = input.nextInt();
            for (int i = 0; i < numeroDeAlunosDoCurso; i++) {

                System.out.println("=============================");
                System.out.println("Enter students data: ");
                System.out.println("=============================");

                try{
                    System.out.print("Nome: ");
                    input.nextLine();
                    String name = input.nextLine();

                    System.out.print("Email: ");
                    String email = input.nextLine();

                    curso.getListaDeAlunos().add(new Aluno(name, email));
                }catch (Exception e){
                    System.out.println("Não foi possivel ler a menssagem! ");
                    System.out.println("Digite novemente! ");

                    System.out.print("Nome: ");
                    String name = input.nextLine();
                    input.nextLine();

                    System.out.print("Email: ");
                    String email = input.nextLine();

                    curso.getListaDeAlunos().add(new Aluno(name, email));

                }

            }

        }
        System.out.println("DADOS DOS CURSO E SEUS ALUNOS: ");
        for(Course curso : alex.getListaDeCursosDoInstrutor()){
            System.out.println("===============================");
            System.out.println("Nome do curso: " + curso.getName());
            System.out.println("===============================");
            for(Aluno aluno : curso.getListaDeAlunos()){
                System.out.println(" - Nome dos alunos: " + aluno.getName());
            }
        }








    }
}

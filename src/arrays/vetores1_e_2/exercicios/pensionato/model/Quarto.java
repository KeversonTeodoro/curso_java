package arrays.vetores1_e_2.exercicios.pensionato.model;
import java.util.ArrayList;
import java.util.List;

public class Quarto {
    List<Student> students;
    List<Lanches> itens;
    double gastos;

    public Quarto(){

    }

    public Quarto(List<Lanches> lanches, List<Student> student){
        this.itens = lanches;
        this.students = student;
    }

    public List<Lanches> getGeladeira() {
        return geladeira;
    }

    public List<Student> getStudentsQuarto(){
        return estudantes;
    }


    List<Lanches> geladeira = new ArrayList<>();
    List<Student> estudantes = new ArrayList<>();
    
    
    public void adicionarStudent(Student estudante){
        estudantes.add(estudante);
    }

    public void adicionarLanches(Lanches lanche){
        geladeira.add(lanche);
    }

    public void adicionarLanche(Lanches lanche) {
        geladeira.add(lanche);
    }

    List<String> lancheConsumidos = new ArrayList<>();


    public void consumirLanche(Lanches lanche){
        double valorLanche = lanche.getPreco();
        this.gastos += valorLanche;

    }

    public double getGasto(){
        return gastos;
    }



}

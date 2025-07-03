package generics_set_map.exercicios.exercicio_curso.model.entitie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {
    private String name;
    private Set<Aluno> listaDeAlunos;

    Set<Aluno> alunosDesseCurso = new HashSet<>();

    public Course(String name, Set<Aluno> lista){
        this.name = name;
        this.listaDeAlunos = lista;
    }

    public Course(){

    }

    public Course(String name){
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    @Override
    public String toString(){
        return name + listaDeAlunos;
    }


}

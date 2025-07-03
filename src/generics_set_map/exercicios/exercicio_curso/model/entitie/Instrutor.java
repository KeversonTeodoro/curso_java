package generics_set_map.exercicios.exercicio_curso.model.entitie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instrutor {
    private String name;
    private Set<Course> listaDeCursosDoInstrutor;

    public Instrutor(String name, Set<Course> lista){
        this.name = name;
        this.listaDeCursosDoInstrutor = lista;
    }

    Set<Course> listaDeCursos = new HashSet<>();

    public Instrutor(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getListaDeCursosDoInstrutor() {
        return listaDeCursosDoInstrutor;
    }


    @Override
    public String toString(){
        return name + listaDeCursosDoInstrutor;
    }


}

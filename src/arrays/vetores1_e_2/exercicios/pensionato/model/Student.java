package arrays.vetores1_e_2.exercicios.pensionato.model;
import java.util.List;
import java.util.ArrayList;

public class Student {
    String nome;
    String email;

    public Student(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return nome + email;
    }



}
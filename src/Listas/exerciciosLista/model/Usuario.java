package Listas.exerciciosLista.model;

public class Usuario {
    int id;
    String nome;
    double salario;

    public Usuario(){

    }

    public Usuario(String nome, double salario, int id){
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }


}
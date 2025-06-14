package arrays.vetores1_e_2.exercicios.pensionato.model;

public class Lanches {
    String nome;
    double preco;

    public Lanches(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString(){
        return nome + preco;
    }


}

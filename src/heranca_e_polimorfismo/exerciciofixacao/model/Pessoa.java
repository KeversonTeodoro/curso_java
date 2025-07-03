package heranca_e_polimorfismo.exerciciofixacao.model;

import java.io.PipedWriter;

public abstract class Pessoa {
    private String name;
    private double income;

    public Pessoa(){

    }

    public Pessoa(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double calcularImposto(){
        return 0;
    }


}

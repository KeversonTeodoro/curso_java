package heranca_e_polimorfismo.exercicios.exercicioproduto.model;

import java.text.ParseException;

public class Produto {
    private String name;
    protected double price;

    public Produto(){

    }

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String priceTag() throws ParseException {
        String preco = String.format("%.2f", price);
        return name + " - " + " $" + preco;
    }
}

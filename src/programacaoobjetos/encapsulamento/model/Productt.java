package programacaoobjetos.encapsulamento.model;

public class Productt {
    private String name;
    private double price;
    private int quantity;

    public Productt(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Productt(String nome, double price){
        this.name = nome;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }



    @Override
    public String toString(){
        return name + ", " + price + ", " + quantity;
    }



}

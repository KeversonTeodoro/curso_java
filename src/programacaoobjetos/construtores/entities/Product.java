package programacaoobjetos.construtores.entities;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }


    public void addStock(int quan){
        quantity += quan;
    }

    public void removeStock(int quant){
        quantity -= quant;

    }

    public double valueInStock(){
        return price * quantity;

    }

    @Override
    public String toString(){
        return "Product: " + name + ", " + "Price: " + price + ", " + "Quantity: " + quantity;
    }


}
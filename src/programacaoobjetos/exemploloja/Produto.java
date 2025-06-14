package programacaoobjetos.exemploloja;

public class Produto {
    String name;
    double price;
    int quantity;


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

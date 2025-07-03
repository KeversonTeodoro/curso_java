package generics_set_map.exeplos_video.model;

import trabalhando_com_arquivos.exercicios.model.entitie.Produto;

public class Product implements Comparable <Product>{
    private String name;
    private int price;

    public Product(){

    }

    public Product(String name, int price) {
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

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return name + ", " + String.format("%.2f", price);
    }


    @Override
    public int compareTo(Product product) {
        return price;
    }


}

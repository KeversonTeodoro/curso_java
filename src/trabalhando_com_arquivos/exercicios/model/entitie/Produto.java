package trabalhando_com_arquivos.exercicios.model.entitie;

public class Produto {
    private String name;
    private double price;
    private int quatity;

    public Produto(){

    }

    public Produto(String name, double price, int quatity) {
        this.name = name;
        this.price = price;
        this.quatity = quatity;
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

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public double total(){
        return price * quatity;
    }
}

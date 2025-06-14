package enumeracoes.exerciciofixacao.model;

public class OrderItem {
    private int quatity;
    private double price;
    private Product product;

    public OrderItem(){

    }

    public OrderItem(int quatity, Product product, double price) {
        this.quatity = quatity;
        this.product = product;
        this.price = price;
    }


    public double subTotal(){
        return price * quatity;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subtotal(){
        return price * quatity;
    }

    @Override
    public String toString(){
        return "Produto: " + getProduct().getNome()
                + ", "
                + " Price: "
                + price
                + " Quatidade: "
                + quatity
                + " Subtotal: "
                + subtotal();
    }



}

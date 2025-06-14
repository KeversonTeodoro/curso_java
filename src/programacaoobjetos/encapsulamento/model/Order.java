package programacaoobjetos.encapsulamento.model;

import java.util.Date;

public class Order {
    private Date date;
    private Productt product;

    public Order(Date date, Productt product){
        this.date = date;
        this.product = product;

    }
    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Productt getProduct(){
        return product;
    }

    public void setProduct(Productt product){
        this.product = product;
    }
}

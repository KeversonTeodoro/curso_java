package enumeracoes.exerciciofixacao.model;

import enumeracoes.model_enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date momentDate;
    OrderStatus status;
    List<OrderItem> itemPedido;
//    OrderItem orderItem;
    Cliente cliente;

    List<OrderItem> itensPedido = new ArrayList<>();

    public Order(){

    }

    public Order(Date data, OrderStatus orderStatus){
        this.momentDate = data;
        this.status = orderStatus;
    }



//    public Order(OrderItem orderItem) {
//        this.orderItem = orderItem;
//    }
//
//    public Order(Cliente cliente){
//        this.cliente = cliente;
//    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMomentDate() {
        return momentDate;
    }

    public void setMomentDate(Date momentDate) {
        this.momentDate = momentDate;
    }

    public void addItem(OrderItem orderItem){
        itensPedido.add(orderItem);

    }

    public void removeItem(OrderItem item){
        itensPedido.remove(item);
    }

    public double total(){

        double sum = 0;
        for(OrderItem orderItem : itensPedido){
            double valor = (double) orderItem.subTotal();
            sum += valor;
        }
        return sum;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Moment Date: ");
        sb.append(form.format(momentDate) + "\n");
        sb.append("Status: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(getCliente() + "\n");
        sb.append("Order items");
        for(OrderItem itensPedido : itensPedido){
            sb.append(itensPedido + "\n");
        }

        sb.append("Total Price: ");
        sb.append(String.format("%.2f", total()));
        return sb.toString();

    }

//    public String toString(){
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(momentDate);
//        stringBuilder.append(status);
//        stringBuilder.append(cliente);
//
//        for(OrderItem itenPedido : itensPedido){
//
//            stringBuilder.append(itenPedido);
//        }
//        return stringBuilder.toString();
//
//    }
}

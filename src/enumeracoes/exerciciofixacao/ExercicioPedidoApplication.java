package enumeracoes.exerciciofixacao;
import enumeracoes.exerciciofixacao.model.Cliente;
import enumeracoes.exerciciofixacao.model.Order;
import enumeracoes.exerciciofixacao.model.OrderItem;
import enumeracoes.exerciciofixacao.model.Product;
import enumeracoes.model_enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static enumeracoes.model_enums.OrderStatus.PENDING_PAYMENT;
import static enumeracoes.model_enums.OrderStatus.PROCESSING;

public class ExercicioPedidoApplication {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");

        Date data1 = new Date();
        System.out.print("Name: ");

        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("Bithday: ");
        String data = input.next();

        Date dataBithday = form.parse(data);

        Cliente cliente2 = new Cliente();
        cliente2.setName(name);
        cliente2.setEmail(email);
        cliente2.setBithDate(dataBithday);

        System.out.println(cliente2);

        System.out.println("Enter order data:");
        System.out.print("Order Status: ");


        OrderStatus pedidoStatus = OrderStatus.valueOf(input.next());



        Date dataAtual = new Date();
        Order pedido = new Order(dataAtual, pedidoStatus);
        pedido.setCliente(cliente2);


//        pedido.setMomentDate(dataAtual);
//        OrderStatus statusDoPedido = OrderStatus.valueOf(statusString);
//        pedido.setStatus(statusDoPedido);


        System.out.print("How many items to this order ?");
        int orderRange = input.nextInt();



        for (int i = 0; i < orderRange; i++) {
            System.out.print("Name: ");
            input.nextLine();
            String productName = input.nextLine();
            System.out.print("Price: ");
            double productPrice = input.nextDouble();

            System.out.print("Quantity: ");
            int quatity = input.nextInt();
            Product produto = new Product(productName, productPrice);
            OrderItem itensPedido = new OrderItem(quatity, produto, productPrice);
            pedido.addItem(itensPedido);


        }

        System.out.println(pedido);
        input.close();


//        Cliente cliente1 = new Cliente("Jao", "JoaoGamer12@gmail.com", data1);
//
//        OrderStatus orderStatus = PROCESSING;
//
//        Product tv = new Product(" tv ", 1000.00);
//        Product mouse = new Product("mouse", 40);
//
//        OrderItem orderItem = new OrderItem(1, tv, tv.getPrice());
//        OrderItem orderItem2 = new OrderItem(2, mouse, mouse.getPrice());
//
//        Order order1 = new Order();
//        order1.addItem(orderItem);
//        order1.addItem(orderItem2);
//        order1.setStatus(orderStatus);
//        order1.setMomentDate(data1);
//
//        System.out.println(order1.total());
//        System.out.println();



    }
}

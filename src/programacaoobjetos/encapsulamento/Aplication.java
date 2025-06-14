package programacaoobjetos.encapsulamento;

import programacaoobjetos.construtores.entities.Product;
import programacaoobjetos.encapsulamento.model.Productt;
import programacaoobjetos.exemploloja.Produto;
import java.util.Scanner;



public class Aplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double price = input.nextDouble();
        int quantity = input.nextInt();

        Productt product = new Productt(name, price);
        Productt produto1 = new Productt("ana", 34,3);

        produto1.setName("opa");
        produto1.setPrice(12);
        System.out.println(produto1.getName());
        System.out.println(produto1.getPrice());
        System.out.println();



    }
}

package programacaoobjetos.construtores;
import programacaoobjetos.construtores.entities.Product;

import java.util.Scanner;



public class Aplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        double price = input.nextDouble();
        int quantity = input.nextInt();

        Product product = new Product(name, price);


        System.out.println(product);


    }
}

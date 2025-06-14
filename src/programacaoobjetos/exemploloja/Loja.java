package programacaoobjetos.exemploloja;

import java.util.Scanner;


public class Loja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto produto1 = new Produto();

        produto1.name = input.nextLine();
        produto1.quantity = input.nextInt();
        produto1.price = input.nextDouble();


        System.out.println(produto1);

        System.out.print("Inert quantity to add in stock: ");
        int quantidade = input.nextInt();
        produto1.addStock(quantidade);

        System.out.println("Dados com update: " + produto1);
        System.out.println();
        System.out.println("Valores em estoque: " + produto1.valueInStock());

        System.out.println("Inert value to remove of stock: ");
        int quantityRemove = input.nextInt();
        System.out.println(produto1);
        System.out.println(produto1.valueInStock());


        input.close();


    }
}

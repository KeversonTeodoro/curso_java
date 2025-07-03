package heranca_e_polimorfismo.exercicios.exercicioproduto;
import heranca_e_polimorfismo.exercicios.exercicioproduto.model.ImportedProduct;
import heranca_e_polimorfismo.exercicios.exercicioproduto.model.Produto;
import heranca_e_polimorfismo.exercicios.exercicioproduto.model.UsedProduct;

import java.text.CompactNumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ExercicioProdutoApplication  {
    public static void main(String[] args) throws ParseException  {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat forms = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> produtos = new ArrayList<>();

        System.out.println("Enter product range: ");

        int productNumber = input.nextInt();

        for (int i = 0; i <productNumber; i++) {
            System.out.print("Common used or imported (c/u/i)? ");
            char quest = input.next().charAt(0);
            System.out.print("Name: ");

            input.nextLine();
            String name = input.nextLine();
            System.out.print("Price: ");
            double price = input.nextDouble();

            if(quest == 'i'){
                System.out.print("Customs free: ");
                double customFree = input.nextDouble();
                Produto produto = new ImportedProduct(name, price, customFree);
                produtos.add(produto);

            } else if (quest == 'c') {
                Produto produto = new Produto(name, price);
                produtos.add(produto);


            } else{
                if(quest == 'u'){
                    System.out.print("Manufacture: ");
                    LocalDate contractDate = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Produto product = new UsedProduct(name, price, contractDate);
                    produtos.add(product);
                }
            }


        }
        System.out.println("Price tags: ");

        for (Produto produto : produtos){
            System.out.println(produto.priceTag());
        }

        input.close();



    }
}

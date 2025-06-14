package arrays.vetores1_e_2;

import java.util.Scanner;

public class AplicationProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert Range: ");
        int range = input.nextInt();
        ProductArray[] vect = new ProductArray[range];
        double sum = 0;

        for(int n = 0; n < range ; n++){
            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();
            vect[n] = new ProductArray(name, price);

        }

        for(int n = 0; n < range; n++){
            sum += vect[n].getPrice();
        }



        double media = sum / vect.length;
        System.out.println(vect[0]);

        System.out.printf("A media dos produtos é %.2f%n ", media);
        input.close();

    }
}

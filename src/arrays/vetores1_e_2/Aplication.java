package arrays.vetores1_e_2;
import java.util.Arrays;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double vect[] = new double[number];

        for(int n = 0; n < number; n++){
            System.out.println("Digite o " + n + " valor");
            vect[n] = input.nextDouble();

        }
        double sum = 0.0;
        for (int n = 0; n < number; n++){
            sum += vect[n];
        }

        double media = sum / vect.length;
        System.out.printf("A média é: %.2f%n ", media);
//        System.out.println(Arrays.stream(vect).average()); forma facil de resolver a média de um vetor

        input.close();

    }



}

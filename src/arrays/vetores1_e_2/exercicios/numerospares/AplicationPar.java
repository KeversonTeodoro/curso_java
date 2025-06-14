package arrays.vetores1_e_2.exercicios.numerospares;

import java.util.Scanner;

public class AplicationPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int range = input.nextInt();
        int[] vect = new int[range];

        int[] numeroPar = new int[range];

        for (int n = 0; n < range; n++) {
            System.out.print("Digite um número: ");
            int number = input.nextInt();
            vect[n] = number;
        }


        int[] numPar = new int[range];

        for (int n = 0; n < range; n++) {
            int numero = (int) vect[n];
            if (numero % 2 == 0) {
                numPar[n] = numero;
                System.out.println(numero);
            }
        }

    }
}

package programacaoobjetos.membrosestaticos;

import programacaoobjetos.membrosestaticos.util.Calculator;

import java.util.Locale;
import java.util.Scanner;
//nomes de constantes são em maiusculo
//palvra final é usada para dizer que o valor vai ser constante e não vai mudar


public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = input.nextDouble();

        double volume = Calculator.volume(radius);
        double circunferencia = Calculator.circumference(radius);

        System.out.println("Circunference: " + circunferencia);
        System.out.println("Volume: " +  volume);





    }



}

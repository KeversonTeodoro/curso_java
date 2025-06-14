package programacaoobjetos.exercicios.exercicio1.exercicio1;

import programacaoobjetos.exercicios.exercicio1.exercicio1.model.Retangulo;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        retangulo.altura = input.nextDouble();
        retangulo.largura = input.nextDouble();

        System.out.println("Area of retângulo is:  " + retangulo.calculateArea());
        System.out.println("The perimeter is: " + retangulo.calculatePerimeter());
        System.out.println("The diagonal is: " + retangulo.calculateDiagonal(12, 56));



    }
}

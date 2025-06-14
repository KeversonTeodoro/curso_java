package programacaoobjetos.exeplotriangulo;

import programacaoobjetos.exeplotriangulo.model.Triangulo;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();
        Triangulo triangulo2 = new Triangulo();

        triangulo.lado1 = input.nextDouble();
        triangulo.lado2 = input.nextDouble();
        triangulo.lado3 = input.nextDouble();

        System.out.println();
        System.out.println("Digite os dados do segundo triangulo");

        triangulo2.lado1 = input.nextDouble();
        triangulo2.lado2 = input.nextDouble();
        triangulo2.lado3 = input.nextDouble();
//
//        double p = (triangulo.lado1 + triangulo.lado2 + triangulo.lado3) / 2.0;
//        double areaTriangulo1 = Math.sqrt(p * ( p - triangulo.lado1) * (p - triangulo.lado2) * (p - triangulo.lado3));
//
//
//        p = (triangulo2.lado1 + triangulo2.lado2 + triangulo2.lado3) / 2.0;
//        double areaTriangulo2 = Math.sqrt(p * ( p - triangulo2.lado1) * (p - triangulo2.lado2) * (p - triangulo2.lado3));

        double area1 = triangulo.areaDefinition();
        double area2 = triangulo2.areaDefinition();

        if(triangulo.mostrarTriangulo() > triangulo2.mostrarTriangulo()){
            System.out.println("P triangulo 1 é maior " + triangulo);
        }
        else{
            System.out.println("O maior é o triagulo 2 " + triangulo2);
        }

        if(area1 > area2){
            System.out.println("A maior area é o do triangulo 1");
        }
        else {
            System.out.println("A maior area é o triangulo 2");
        }
    }
}

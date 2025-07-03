package heranca_e_polimorfismo.metodosabstratos;
import heranca_e_polimorfismo.metodosabstratos.entitieenum.Color;
import heranca_e_polimorfismo.metodosabstratos.model.Circle;
import heranca_e_polimorfismo.metodosabstratos.model.Rectangle;
import heranca_e_polimorfismo.metodosabstratos.model.Shape;

import java.util.ArrayList;
import java.util.List;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.print("Enter shape numbers: ");
        int shapeNumber = input.nextInt();

        for (int i = 0; i < shapeNumber; i++) {

            System.out.print("Rectangle or circle (r/c) ?");
            char escolha = input.next().charAt(0);

            System.out.print("Enter color: ");
            Color color = Color.valueOf(input.next());

            if(escolha == 'c'){
                System.out.print("Enter radius: ");
                double radius = input.nextDouble();
                Shape circle = new Circle(color, radius);
                shapes.add(circle);
            }

            else if(escolha == 'r'){

                System.out.print("Width: ");
                double width = input.nextDouble();
                System.out.print("Height: ");
                double height = input.nextDouble();
                Shape rectangle = new Rectangle(color, width, height);
                shapes.add(rectangle);

            }

        }

        System.out.println("shape areas");
        for (Shape shape : shapes){
            System.out.println(String.format("%.2f", shape.area()));
        }




    }
}

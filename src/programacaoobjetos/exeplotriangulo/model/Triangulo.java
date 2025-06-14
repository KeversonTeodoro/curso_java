package programacaoobjetos.exeplotriangulo.model;

public class Triangulo {

    public double lado1;
    public double lado2;
    public double lado3;

//    public Triangulo(double lado1, double lado2, double lado3){
//        this.lado1 = lado1;
//        this.lado2 = lado2;
//        this.lado3 = lado3;
//    }


    public Double areaDefinition(){
        double p = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(p * (p - lado1) * (p- lado2) * (p - lado3));

    }


    public Double mostrarTriangulo(){
        return lado1 + lado2 + lado3;

    }

}
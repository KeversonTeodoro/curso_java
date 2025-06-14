package programacaoobjetos.exercicios.exercicio1.exercicio1.model;

public class Retangulo {
    public double altura;
    public double largura;

    public double calculateArea(){
        return altura * largura;
    }

    public double calculatePerimeter(){
        return 2 * (largura + altura);
    }

    public double calculateDiagonal(double lado1, double lado2){
        return Math.sqrt((lado1 * lado1) + (lado2 * lado2));
    }


}

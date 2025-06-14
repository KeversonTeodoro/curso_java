package programacaoobjetos.exercicios.exerciciofixacaodolar;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolar = input.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double valor = input.nextDouble();
        double resultado = CurrencyConverter.convertForDolar(dolar, valor);

        System.out.println("Amount to be paid in reais");
        System.out.println(resultado);

    }
}

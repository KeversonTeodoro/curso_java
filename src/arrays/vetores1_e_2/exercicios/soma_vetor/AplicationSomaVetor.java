package arrays.vetores1_e_2.exercicios.soma_vetor;
import java.util.Scanner;

public class AplicationSomaVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inert vetor range: ");
        int range = input.nextInt();

        double[] numeros = new double[range];

        double sum = 0;

        for(int n = 0; n < range; n++){
            System.out.print("Digite o " + n + "numero: ");
            double number = input.nextDouble();
            sum += number;
            numeros[n] = number;
        }
        double media = sum / numeros.length;

        System.out.println("Valores: ");
        for(double numero : numeros){
            System.out.println(numero);
        }

        // quebra de linha
        System.out.println();

        System.out.print("A soma foi: " + sum);
        System.out.printf("A média foi %.2f%n: ", media);


    }
}

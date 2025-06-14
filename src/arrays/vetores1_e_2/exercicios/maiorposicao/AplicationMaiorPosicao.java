package arrays.vetores1_e_2.exercicios.maiorposicao;
import java.util.Scanner;

public class AplicationMaiorPosicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert vetor range: ");
        int range = input.nextInt();

        double[] numbers = new double[range];
        double maiorNumero = 0;
        int posicaoMaior = 0;

        for(int n = 0; n < range ; n++){
            System.out.print("Digite o " + n + "numero: ");
            double num = input.nextDouble();
            numbers[n] = num;
        }

        for(double numero : numbers){
            if(numero > maiorNumero){
                maiorNumero = numero;
            }
        }

        for(int n = 0; n < range; n++){
            if (numbers[n] == maiorNumero){
                posicaoMaior = n;
            }
        }

        System.out.println("O maior numero do array é: " + maiorNumero);
        System.out.println("E esta na posição: " + posicaoMaior);



    }
}

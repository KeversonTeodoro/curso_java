package arrays.vetores1_e_2.exercicios.numerosnegativos;
import java.util.Scanner;

public class AplicationNumNegativos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inert range number: ");
        int range = input.nextInt();
        int[] negativeNumber = new int[range];

        int[] numbers = new int[range];
        for(int n = 0; n < range; n++){
            System.out.print("Digite o " + n + "numero: ");

            int number = input.nextInt();
            if(number < 0){
                negativeNumber[n] = number;
            }
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int numero : negativeNumber){
            System.out.println(numero);
        }






    }
}

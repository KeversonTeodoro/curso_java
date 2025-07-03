package EstruturaRepeticao;
import java.util.Scanner;


public class MediaPonderada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Range: ");
        int range = input.nextInt();
        for (int i = 0; i < range; i++) {

            System.out.println("Enter " + i + "case: ");
            input.nextLine();
            double valor1 = input.nextDouble();
            double valor1ComPeso = valor1 * 2;

            double valor2 = input.nextDouble();
            double  valor2ComPeso = valor2 * 3;

            double valor3 = input.nextDouble();
            double valor3ComPeso = valor3 * 5;

            int soma = 2 + 3 + 5;

            double media = (valor1ComPeso + valor2ComPeso + valor3ComPeso) / soma;

            System.out.printf("Media ponderada = %.2f", media);



        }

    }
}

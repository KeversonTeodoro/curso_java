package EstruturaRepeticao;
import java.util.Scanner;

public class ex002For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter range: ");
        int range = input.nextInt();

        int numerosFora = 0;
        int numerosDentro = 0;

        for (int i = 0; i < range; i++) {

            System.out.print("Enter " + i + "number: ");
            int valor = input.nextInt();


            if(valor >= 10 && valor <= 20){
                numerosDentro +=1;

            }

            else{
                    numerosFora += 1;
            }




        }
        System.out.println("in " + numerosDentro);
        System.out.println("out: " + numerosFora);

        input.close();

    }
}

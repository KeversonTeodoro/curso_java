package funcaosintaxe;
import java.util.Scanner;

public class Funcao_Sintax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int higher = findMax(num1, num2, num3);
        mostrarMenssagem(higher);


//        if(num1 > num2 && num1> num3){
//            System.out.println("O maior numero é o " + num1);
//        }
//        else if (num2 > num3) {
//            System.out.println("O maior numero é o " + num2);
//        }
//        else{
//            System.out.println("O maior é " + num3);
//        }
    }

    public static Integer findMax(int num1, int num2, int num3){
        int variable;
        if(num1 > num2 && num1 > num3){
            System.out.println("O " + num1 + "é " + "maior");
            variable = num1;
        }
        else if (num2 > num3) {
            System.out.println("O maior é o " + num2);
            variable = num2;
        }
        else {
            System.out.println("O maior é o " + num3);
            variable = num3;
        }

        return variable; //pode colicar para retornar separados tipo: num1+ num2 + num3
    }

    public static void mostrarMenssagem(int variavel){
        System.out.println("O maior numero é O: " + variavel);
    }


}

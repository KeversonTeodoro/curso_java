package tratamento_de_excecoes;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        method1();


        System.out.println("End of program");


//        while(isRodando){
//
//            try{
//                String[] vetor = input.nextLine().split(" ");
//                int position = input.nextInt();
//                System.out.println(vetor[position]);
//            }
//            catch (Exception erro){
//                System.out.println("Tente de novo ");
//                int position = input.nextInt();
//
//            }
//
//
//
//        }


        input.close();
    }

    public static void method1(){
        System.out.println("METODO 1 START");
        method2();
        System.out.println("METODO 1 FINAL");
    }

    public static void method2(){
        System.out.println("****METODO 2 START****");
        Scanner input = new Scanner(System.in);
        boolean isRodando = true;

        try{
            String[] vetor = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vetor[position]);
        }

        catch (ArrayIndexOutOfBoundsException erroNoVetor){
            System.out.println("Essa posição não existe! ");
            erroNoVetor.printStackTrace(); // vai mostrar o caminho de metodos que acarretaram na excecao
            input.next();
        }
        catch (InputMismatchException erroNoInput){
            System.out.println("Digite apenas valore inteiros! ");
        }

        System.out.println("****MÉTODO 2 FINAL****");
    }
}

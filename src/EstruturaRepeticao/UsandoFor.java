package EstruturaRepeticao;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UsandoFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;

        int numero = input.nextInt();
        for(int n=0; n < numero ; n++){
            System.out.println("Digite o valor " + n);
            int num = input.nextInt();
            soma += num;

        }
        System.out.println(soma);

        for(int n = 5 ; n > 0 ; n--){
            System.out.println(n);
        }
    }





}

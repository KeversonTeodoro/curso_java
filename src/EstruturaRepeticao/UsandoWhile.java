package EstruturaRepeticao;
import java.util.Scanner;

public class UsandoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Digite um valor: ");

        int valorDeVerificacao = input.nextInt();
        int soma = 0;

        while(valorDeVerificacao != 0){
            System.out.println("Digite novamente: ");
            valorDeVerificacao = input.nextInt();

            soma += valorDeVerificacao;

            if(valorDeVerificacao == 0){
                System.out.println(soma);
                break;
            }
        }
    }
}

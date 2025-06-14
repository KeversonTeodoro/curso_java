package arrays.vetores1_e_2.exercicios.alturas;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AlturasAplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int range = input.nextInt();
        double[] alturas = new double[range];

        double sum = 0;
        double maiorAltura = 0;
        int maiorIdade = 0;
        int count = 0;
        String[] pessoasMenos16 = new String[range];


        for(int n =0; n < range; n++){
            String nome = input.next();
            double altura = input.nextDouble();
            int idade = input.nextInt();

            if(idade < 16){
                count += 1;
                pessoasMenos16[n] = nome;
            }

            if(altura > maiorAltura){
                maiorAltura = altura;
            }

            alturas[n] = altura;

            sum += altura;
        }
        int porcentagem = (count * 100) / range;

        System.out.println("A média de idade dessas pessoas é: " + sum / alturas.length);
        System.out.println();
        System.out.println("As pessoas com menos de 16 anos são: ");
        for(String nome : pessoasMenos16){
            System.out.println(nome);

        }


        System.out.println("porcentagem de pessoas com menos de 16 anos: " + porcentagem);

        input.close();

    }
}

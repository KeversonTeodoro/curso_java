package expressoea_lambda.entendendo_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MiniDesafioLambda {
    public static void main(String[] args) {

        // mini desafio usando lambda
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Beatriz", "Amanda", "Bruno", "Caio");
        // objetivo, imprimit todos os nome da lista

        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("============================");
        System.out.println("Nomes com letra A");
        System.out.println("============================");

        nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .forEach(nome -> System.out.println(nome));

        System.out.println("---------------------------");
        // imprimindo os nomes em ordem alfabética


        nomes.stream()
                .sorted()
                .forEach(nome -> System.out.println(nome));


        System.out.println("--------------------------");
        // trasnforma e imprime os nome em maiusculo, usando o map
        // map é usado para tranformar os dados

        nomes.stream()
                .map(nome -> nome.toUpperCase())
                .forEach(nome -> System.out.println(nome));

        int count = 0;




        System.out.println("quantidade de pessoas que começam com a letra B");
    }
}

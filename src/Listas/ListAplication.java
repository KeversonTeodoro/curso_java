package Listas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListAplication {
    public static void main(String[] args) {
        List<String> pessoas = new ArrayList<>();


        pessoas.add("Maria");
        pessoas.add("Marianne");
        pessoas.add("Pedro");
        pessoas.add("Jõao");
        pessoas.add("Bob");
        pessoas.add(2, "Júnior") ;

        System.out.println(pessoas);

//        pessoas.removeIf(nome -> nome.charAt(0) == 'M');

        for(String pessoa : pessoas){
            System.out.println(pessoa);
        }



        System.out.println("Indef of bob " + pessoas.indexOf("Bob"));

        //quando o elemento não esta na lista ele coloca o valor para negativo
        System.out.println("Indef of marco " + pessoas.indexOf("Marco"));

        System.out.println("====================================");


        List<String> result = pessoas.stream().filter(nome -> nome.charAt(0) == 'M').collect(Collectors.toList());
        for(String pessoa : result){
            System.out.println(pessoa);
        }

        // buscando na lista de pessoas o primeiro elemento que começa com uma determinada letra,
        //caso não exixtir ele retorna null e guarda o resultado na variavel do mesmo tipo

        String name = pessoas.stream().filter(nome -> nome.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);




    }
}

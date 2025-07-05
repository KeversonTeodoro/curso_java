package expressoea_lambda.exemplo_video;



import expressoea_lambda.exemplo_video.model.entitie.ProdutoLambdaExemplo;
import generics_set_map.exemplo_map.model.entities.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // fazendo uma função para comparar objetos usando lambda vendo arrow function
        List<ProdutoLambdaExemplo> listaDeProduto = new ArrayList<>();

        listaDeProduto.add(new ProdutoLambdaExemplo("tv", 1200));
        listaDeProduto.add(new ProdutoLambdaExemplo("table", 400));
        listaDeProduto.add(new ProdutoLambdaExemplo("notebook", 600));


        // define o nome da função, depois coloca os parametro que a função vai receber, e a seta vai apontar para o que a expressão vai fazer

//        Comparator<ProdutoLambdaExemplo> comparador = (produto1, produto2) -> {
//            return produto1.getName().toUpperCase().compareTo(produto2.getName().toUpperCase());
//        };

//        listaDeProduto.sort(comparador);

        // comparator com
        // a seta indica a implementação da função
        listaDeProduto.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));


        for(ProdutoLambdaExemplo produto : listaDeProduto){
            System.out.println(produto);
        }
        System.out.println("==========================================");

        listaDeProduto.forEach(p -> System.out.println(p));

        System.out.println("--------------------------------------------------");

        //exemplo para printar os nome que começam com a letra t
        // ele filtra os nome
        // sintaxe básica: (parâmetro) -> ação
        // a seta aponta para o trabalho que a função vai fazer


        listaDeProduto.stream()
                .filter(produto -> produto.getName().startsWith("t"))
                .forEach(produto -> System.out.println(produto.getName()));


        Integer sum = 0;




    }
}

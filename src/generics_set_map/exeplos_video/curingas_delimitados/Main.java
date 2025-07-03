package generics_set_map.exeplos_video.curingas_delimitados;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Double> myDouble = Arrays.asList(1.3, 45.7, 78.2);
        List<Object> myObj = new ArrayList<Object>();

        copy(myInts, myObj);
        copy(myDouble, myObj);

        printarLista(myObj);



    }

    // método que copia uma lista do tipo curinga que extende um tipo generico de number

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for(Number num : source){
            destiny.add(num);
        }
    }


    // método que recebe uma lista do tipo curinga e mostra os dados.
    public static void printarLista(List<?> lista){
        for(Object object : lista){
            System.out.println(object);
        }
    }
}

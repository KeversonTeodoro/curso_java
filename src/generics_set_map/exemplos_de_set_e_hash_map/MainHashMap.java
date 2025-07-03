package generics_set_map.exemplos_de_set_e_hash_map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainHashMap {
    public static void main(String[] args) {
//        Set<String> set HashSet<>(); // rápido porem não ordena a lista

        // usa o tree set quando a implementação da classe for to tipo comparable
        // o set não aceita repetições

        Set<String> set = new LinkedHashSet<>();

        set.add("Tablet");
        set.add("Notebook");
        set.add("TV");
        set.add("Piscina");

//        set.removeIf(objeto -> objeto.length() > 3); // um pouco de expressão lambda
        set.removeIf(string -> string.charAt(0) == 'T'); // vai remover a string que começar com a letra T


        for(String objeto : set){
            System.out.println(objeto);
        }
    }
}

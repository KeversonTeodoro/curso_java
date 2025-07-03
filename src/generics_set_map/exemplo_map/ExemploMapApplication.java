package generics_set_map.exemplo_map;

import generics_set_map.exemplo_map.model.entities.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploMapApplication {
    public static void main(String[] args) {


//        Map<String, String> cookies = new TreeMap<>();
//
//        cookies.put("Username", "Maria");
//        cookies.put("Email", "maria123@gmail.com");
//        cookies.put("Phone", "(38)9986-9877");
//
//
//        cookies.remove("Email");
//        for(String key : cookies.keySet()){
//            System.out.println(key + ": " + cookies.get(key));
//        }
//        System.out.println(cookies);

        Map<Produto, Double> stock = new HashMap<>();

        Produto product1 = new Produto("Tv", 1200.0);
        Produto product2 = new Produto("Notebook", 200.0);
        Produto product3 = new Produto("Tablet", 3000.0);

        stock.put(product1, 1200.0);
        stock.put(product2, 200.0);
        stock.put(product3, 3000.0);

        Produto ps = new Produto("Tv", 1200.0);

        System.out.println("Contains " + stock.containsKey(ps));





    }
}

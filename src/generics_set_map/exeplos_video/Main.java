package generics_set_map.exeplos_video;

import generics_set_map.exeplos_video.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        String path = "/home/youx/Documentos/programacao/youxlab-treino-git/curso_java/src/generics_set_map/exeplos_video/pessoas.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line!= null){
                String[] fields = line.split(",");
//                lista.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();


            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}

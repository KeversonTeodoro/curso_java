package generics_set_map.exercicios.exercicio_fixacao;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> listaDePessoa = new ArrayList<>();

        String path = "/home/youx/Documentos/programacao/youxlab-treino-git/curso_java/src/generics_set_map/exercicios/exercicio_fixacao/arquivos/pessoas.txt";
        try(BufferedReader leitor = new BufferedReader(new FileReader(path))){
            String line = leitor.readLine();

            while (line != null){
                String[] pessoas = line.split( ", ");
                listaDePessoa.add(criarPessoa(pessoas[0], Integer.parseInt(pessoas[1])));
                line = leitor.readLine();

            }
        }
        catch (IOException e ){
            System.out.println(e.getMessage());
        }
        for(Map<String, Object> pessoa : listaDePessoa){
            for(String key : pessoa.keySet()){
                System.out.println(key + ": " + pessoa.get(key));
            }
//            for(String key : pessoa.keySet()){
//                System.out.println(pessoa.get(key));
//            }


        }

    }

    public static Map<String, Object> criarPessoa(String name, int voto){
        Map<String, Object> pessoas = new TreeMap<>();
        pessoas.put("Name", name);
        pessoas.put("Voto", voto);
        return pessoas;
    }
}

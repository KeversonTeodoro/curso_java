package tratamento_de_excecoes.exemplosvideo;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class LendoArquivos {
    public static void main(String[] args) {

        File file = new File("/home/youx/Documentos/programacao/youxlab-treino-git/curso_java/src/tratamento_de_excecoes/mensagem.txt");
        Scanner scam = null;

        try{
            scam = new Scanner(file);
            while(scam.hasNextLine()){
                System.out.println(scam.nextLine());
            }
        }

        catch (FileNotFoundException erroNoArquivo){
            System.out.println("Error opening file: " + erroNoArquivo.getMessage());
        }
        finally {

            if(scam != null){
                scam.close();
            }
            System.out.println("Finally bloc executed");
        }

    }
}

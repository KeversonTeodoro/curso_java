package trabalhando_com_arquivos.exemplo_video.forma_correta;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) {

        String path = "/home/youx/Documentos/programacao/youxlab-treino-git/curso_java/src/trabalhando_com_arquivos/exemplo_video/forma_correta/mensagem.txt";
        try (BufferedReader leitorBuffado = new BufferedReader(new FileReader(path))){

            String line = leitorBuffado.readLine();
            while(line != null){
                System.out.println(line);
                line = leitorBuffado.readLine();
            }

        }
        catch (IIOException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

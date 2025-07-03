package trabalhando_com_arquivos.exemplo_video.filewriter_exemplo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class MainFileWriter {
    public static void main(String[] args) {
        String path = "/home/youx/Documentos/programacao/youxlab-treino-git/curso_java/src/trabalhando_com_arquivos/exemplo_video/filewriter_exemplo/mensagem.txt";

        String[] mensagens = new String[]{ "animes and watch tv shows", "lol", "Essa linha vai ser escrita em outro arquivo" };

        Scanner scam = null;

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(path, true))){
            // para não criar um novo arquivo é necessario passar um parametro true!!

            for(String line : mensagens){
                escritor.write(line);
                escritor.write(" ");
                escritor.newLine();

            }
            System.out.println("Arquivo lido com sucesso!!");


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package trabalhando_com_arquivos.exemplo_video.buffered_reader_exemplo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String path = "/home/youx/Documentos/programacao/spring/desafio.chat/src/main/java/desafio/chat/arquivos/usuarios_100k.json";

        Scanner scam = null;
        FileReader leitorNomral = null;
        BufferedReader leitorBuffado = null;

        try{
            leitorNomral = new FileReader(path);
            leitorBuffado = new BufferedReader(leitorNomral);

            String nextLineOfFile = leitorBuffado.readLine();
            while(nextLineOfFile != null){
                System.out.println(nextLineOfFile);
                nextLineOfFile = leitorBuffado.readLine();
            }

        }
        catch (FileNotFoundException arquivoErro){
            System.out.println(arquivoErro.getMessage());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                if(leitorNomral != null){
                    leitorNomral.close();
                }
                if(leitorBuffado != null){
                    leitorBuffado.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }


        }
    }
}

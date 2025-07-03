package generics_set_map.exemplo_log;

import generics_set_map.exemplo_log.model.entitie.Log;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LogApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo! ");
        String path = input.nextLine();

        try(BufferedReader escritor = new BufferedReader(new FileReader(path))){
            Set<Log> set = new HashSet<>();
            String line = escritor.readLine();
            while(line != null){

                String[] camposDoDaString = line.split(" ");
                String username = camposDoDaString[0];
                Date logMoment = Date.from(Instant.parse(camposDoDaString[1]));
                set.add(new Log(username, logMoment));

                System.out.println(camposDoDaString.length);;
            }

        }catch (IIOException e){
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        input.close();
    }
}

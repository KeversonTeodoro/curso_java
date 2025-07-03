package tratamento_de_excecoes.exemplosvideo.problema_hotel;
import tratamento_de_excecoes.exemplosvideo.problema_hotel.model.entities.Reservation;
import tratamento_de_excecoes.exemplosvideo.problema_hotel.model.exception.DomainException;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat form = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.println("Enter reservation data: ");
            System.out.print("Room number: ");
            int roomNumber = input.nextInt();
            System.out.print("Check-in date: ");
            Date checkIn = form.parse(input.next());
            System.out.print("Checkout date: ");
            Date checkout = form.parse(input.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkout);
            System.out.println(reservation.toString());

            System.out.println();
            System.out.println("Enter new reservation data: ");

            reservation.updateDates();


        }
        catch (ParseException erro){
            System.out.println("Error" + erro.getMessage());
        } catch (DomainException e) {
            System.out.println("Error in reservation " + e.getMessage());
        }


//        Scanner scam = null;
//        File file = new File ("/home/youx/Documentos/programacao/youxlab-treino-git/curso_java/src/tratamento_de_excecoes/mensagem.txt");
//
//        try{
//            scam = new Scanner(file);
//            System.out.println("Lendo arquivo.... ");
//            while(scam.hasNextLine()){
//                System.out.println(scam.nextLine());
//            }
//        }
//        catch (FileNotFoundException arquivoNotFound){
//            System.out.println("Arquivo não encontrado");
//        }
//        finally {
//            System.out.println("Programa executado!");
//        }

    }
}

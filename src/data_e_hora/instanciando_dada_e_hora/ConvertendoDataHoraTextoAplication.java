package data_e_hora.instanciando_dada_e_hora;

import javax.swing.text.DateFormatter;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDataHoraTextoAplication {
    public static void main(String[] args) {
        LocalDate data4 = LocalDate.parse("2025-07-20");
        LocalDateTime data5 = LocalDateTime.parse("2025-07-20T01:34:23.02342324");

        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //pega o fuzorario do computador da pessoa
        DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // transformando a data e hora global em variavel local, pegando um instant
        Instant data6 = Instant.parse("2022-07-20T01:30:26Z");
        LocalDate resultado1 = LocalDate.ofInstant(data6, ZoneId.systemDefault());
        LocalDate resultado2 = LocalDate.ofInstant(data6, ZoneId.of("Portugal"));
        LocalDateTime resultado3 = LocalDateTime.ofInstant(data6, ZoneId.systemDefault());
        LocalDateTime resultado4 = LocalDateTime.ofInstant(data6, ZoneId.of("Portugal"));


        System.out.println("Data 5 = " + data5.format(form3));
        System.out.println("data 4 + " + data4.format(form));
        System.out.println("Data hora global para local: " + resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(data4.getEra());
        System.out.println(data4.getDayOfWeek());
        System.out.println("Dia do mes de data 4 = " + data4.getDayOfMonth());
        System.out.println("Minuto de data5 = " + data5.getMinute());
        System.out.println("Segundo de data5 = " + data5.getSecond());



    }
}

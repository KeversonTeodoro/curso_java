package data_e_hora.instanciando_dada_e_hora;

import javax.swing.text.DateFormatter;
import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {

        LocalDate data4 = LocalDate.parse("2025-06-10");
        LocalDateTime data5 = LocalDateTime.parse("2025-06-10T13:38:45");
        Instant data6 = Instant.parse("2025-06-10T13:38:45Z");

        LocalDate pastweek = data4.minusDays(7);
        LocalDate nextWeek = data4.plusDays(7);
        LocalDate pastweekOfPastWeek = pastweek.minusDays(7);

        LocalDateTime pastWeekLocalDateTime = data5.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data5.plusDays(7);

        Instant pastWeekInstant = data6.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data6.plus(7, ChronoUnit.DAYS);


        Duration duracao1 = Duration.between(pastWeekLocalDateTime, data5);
        Duration duracao2 = Duration.between(pastweek.atStartOfDay(), data4.atStartOfDay());
        Duration duracaoWithInstant = Duration.between(pastWeekInstant, data6);
        Duration duracaoWithInstant2 = Duration.between(data6, pastWeekInstant);


        System.out.println(pastweek);
        System.out.println(nextWeek);
        System.out.println("Past week of past week = " + pastweekOfPastWeek);
        System.out.println();
        System.out.println("Instant past week = " + pastWeekInstant);
        System.out.println("Instant next weeek = " + nextWeekInstant);
        System.out.println(duracao1);
        System.out.println("Dias de duração entre duas datas " + duracao1.toDays());
        System.out.println("Duração de localDate normal convertido para dateTime " + duracao2.toDays());
        System.out.println(duracaoWithInstant.toDays());


    }

}

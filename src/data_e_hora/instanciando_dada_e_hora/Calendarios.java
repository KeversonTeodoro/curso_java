package data_e_hora.instanciando_dada_e_hora;

import javax.swing.text.DateFormatter;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Calendarios {
    public static void main(String[] args) {
        SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        List<Calendar> datas = new ArrayList<>();

        System.out.println(formatacao.format(data1));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data1);

        int minutes = calendar.get(Calendar.MINUTE);
        int month = 1 + calendar.get(Calendar.MONTH);
        System.out.println("Minutes " + minutes);
        System.out.println("Month " + month);

//        calendar.setTime(data1);
//        calendar.add(Calendar.HOUR_OF_DAY, 4);
//        data1 = calendar.getTime();


        System.out.println(formatacao.format(data1));






    }
}

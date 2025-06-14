package data_e_hora.instanciando_dada_e_hora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.text.DateFormatter;
import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class TrabalhandoComDatas {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        format2.setTimeZone(TimeZone.getTimeZone("GMT"));


        Date data3 = new Date();
        Date data4 = new Date(System.currentTimeMillis());
        Date data5 = new Date(0L);
        Date data6 = new Date(1000L * 60L * 60L * 5L);

        //////////////////////////////////////////



        Date data1 = format1.parse("21/08/2007");
        Date data2 = format2.parse("21/08/2007 15:45:34");
        Date outraData = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // especificando que a data
        // de cima esta sendo passada para o formado iso do no padrão gmt


        System.out.println(data1);
        System.out.println(data2);

        System.out.println(format1.format(data1));
        System.out.println(format1.format(data2));
        System.out.println(format2.format(data2));

        System.out.println(data3);
        System.out.println(data4);
        System.out.println(data5);
        System.out.println(data6);
        System.out.println(format2.format(outraData));



    }
}

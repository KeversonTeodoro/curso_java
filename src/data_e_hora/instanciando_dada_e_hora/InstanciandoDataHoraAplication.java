package data_e_hora.instanciando_dada_e_hora;
import javax.swing.text.DateFormatter;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class InstanciandoDataHoraAplication {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();
        DateTimeFormatter forms = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter forms2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH/mm");



        String dataString = "2023-04-21";
        LocalDate data4 = LocalDate.parse("2025-07-20");
        LocalDateTime data5 = LocalDateTime.parse("2025-07-20T01:34:23.02342324");
        LocalDate data6 = LocalDate.parse(dataString);
        Instant data7 = Instant.parse("2025-07-23T03:45:23Z");

        //intanciando a data e hora normal e passando para o fuso horario z fazendo a operação de subtração
        Instant data8 = Instant.parse("2025-07-23T03:45:04-03:00");
        LocalDateTime data2EmString = LocalDateTime.parse(data2.toString());

        LocalDate data9 = LocalDate.parse("23/05/3000", forms);

        LocalDate data10 = LocalDate.of(2012, 7, 23);
        LocalDateTime data11 = LocalDateTime.of(2012, 07, 23, 1, 23);



        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        System.out.println("Data iso = "+data4);
        System.out.println(data5);


        // é possivel pasar uma string atraves de uma variável e transformar em uma data iso.
        System.out.println(data6);

        // quebra de linha
        System.out.println();

        System.out.println("Data transformada em iso atravé do tostring");
        System.out.println();
        System.out.println(data2EmString);

        System.out.println(data8);

        System.out.println(data7);
        System.out.println(data9);
        System.out.println(data10);
        System.out.println(data11);


    }
}

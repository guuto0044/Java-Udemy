package com.cursojava.secao11.dateTimeText;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
//      Formatação DataHora para texto:

        LocalDate d04 = LocalDate.parse("2025-03-19");
        LocalDateTime d05 = LocalDateTime.parse("2025-03-19T14:45:20");
        Instant d06 = Instant.parse("2025-03-19T14:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
//        Pega o fuso horario do computador do usuario:
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Data Local sem fuso Horario( Instante dá uma excessao )
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


//        Padrão ISO 8601
        System.out.println("d04 = " + d04);

        System.out.println("d04 = " + d04.format(fmt1));
//        Outra Forma de realização:
        System.out.println("d04 = " + fmt1.format(d04));
//        Outra Forma de realização:
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println();

        System.out.println("d05 = " + d05);
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("d05 = " + d05.format(fmt4));

        System.out.println();

        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("d06 = " + d06.toString());




    }
}

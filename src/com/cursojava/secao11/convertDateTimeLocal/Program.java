package com.cursojava.secao11.convertDateTimeLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-03-19");
        LocalDateTime d05 = LocalDateTime.parse("2025-03-19T14:45:20");
        Instant d06 = Instant.parse("2025-03-19T01:30:26Z"); // Time Zone, Grupo GMT


//        for (String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s); // Nomes Para especificar um fuso Horario.
//        }

        LocalDate r1 = LocalDate.ofInstant(d06,ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06,ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06,ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06,ZoneId.of("Portugal"));


        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println();
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println();
//      Obeter dados de uma data-hora local:
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());
    }
}

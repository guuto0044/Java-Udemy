package com.cursojava.secao11.calcDateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2025-03-19");
        LocalDateTime d05 = LocalDateTime.parse("2025-03-19T14:45:20");
        Instant d06 = Instant.parse("2025-03-19T01:30:26Z"); // Time Zone, Grupo GMT, Data Global


        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("Past Week LocalDate = " + pastWeekLocalDate);
        System.out.println("Next Week LocalDate = "+ nextWeekLocalDate);


        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("Past Week LocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("Next Week LocalDateTime = "+ nextWeekLocalDateTime);


        Instant pastWeekInstants = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstants = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Past Week Instants = " + pastWeekInstants);
        System.out.println("Next Week Instants = " + nextWeekInstants);

    }
}

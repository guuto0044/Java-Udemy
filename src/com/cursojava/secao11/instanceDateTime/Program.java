package com.cursojava.secao11.instanceDateTime;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
//        Trabalho com Datas:

        LocalDate d01 = LocalDate.now();

        LocalDateTime d02 = LocalDateTime.now();

        Instant d03 = Instant.now(); // Horario de Londres GMT;

        LocalDate d04 = LocalDate.parse("2025-03-19");
        LocalDateTime d05 = LocalDateTime.parse("2025-03-19T01:30:26");
        Instant d06 = Instant.parse("2025-03-19T01:30:26Z");
        Instant d07 = Instant.parse("2025-03-19T01:30:26-03:00"); // Ele pega o horario em relaçãp ao horario de
        // Londres
//        Texto em formato customizado:
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formata o d08
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");// Formata o d09
        LocalDate d08 = LocalDate.parse("19/03/2025", fm1);
//        LocalDate d08 = LocalDate.parse("19/03/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("19/03/2025 14:30", fm2);

        LocalDate d10 = LocalDate.of(2025,3,19);
        LocalDateTime d11 = LocalDateTime.of(2025,3,19,14,45,20);

//      ISO 8601
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03.toString()); // Adicionando o .toString ele já adota o padrão ISO 8601
        System.out.println("do04 = " + d04);
        System.out.println("do05 = " + d05);
        System.out.println("do06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }
}

package com.cursojava.secao14.criacaoexecaopersonalizada.application;

import com.cursojava.secao14.criacaoexecaopersonalizada.entities.Reservation;
import com.cursojava.secao14.criacaoexecaopersonalizada.model.exception.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            System.out.print("Check-in date(dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date(dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber,checkIn,checkOut);

            System.out.println(reservation);

            System.out.println();

            System.out.println("Enter data to update the reservation: ");

            System.out.print("Check-in date(dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out date(dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn,checkOut);

            System.out.println(reservation);


        } catch (ParseException e){
            System.out.println("Invalid date format!");
        } catch (DomainException e){
            System.out.println("Error in reservation: " +  e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected Erro!");
        }

        sc.close();
    }
}

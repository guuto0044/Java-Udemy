package com.cursojava.secao12.exercicioResolvido;

import com.cursojava.secao12.exercicioResolvido.entities.Departament;
import com.cursojava.secao12.exercicioResolvido.entities.HourContract;
import com.cursojava.secao12.exercicioResolvido.entities.Worker;
import com.cursojava.secao12.exercicioResolvido.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter Worker data: ");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary,
                new Departament(departamentName)); // "Departament" é instanciado no Worker e ele vai estar associado
//        com o Worker(Associação);

        System.out.println("How many contracts to this worker: ");
        int qtdContracts = sc.nextInt();

        for (int i = 0; i < qtdContracts; i++){

            System.out.println("Enter Contract #"+ (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.print("Duration (Hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHour,hours);

            worker.addContract(contract); // Asssocia meu contrato(contract) com o Trabalhador (Worker)
        }

        System.out.println();

        System.out.print("Enter month and year to calculate (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year,month)));

        sc.close();
    }
}

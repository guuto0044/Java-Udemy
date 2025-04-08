package com.cursojava.secao13.exerciciofixacaofinal.application;

import com.cursojava.secao13.exerciciofixacaofinal.application.entities.Company;
import com.cursojava.secao13.exerciciofixacaofinal.application.entities.Individual;
import com.cursojava.secao13.exerciciofixacaofinal.application.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Person>list = new ArrayList<>();

        for (int i = 0; i < n; i++){

            System.out.print("Individual or Company(i/c)? ");
            String options = sc.next();

            if (options.equals("c")){

                System.out.print("Name: ");
                String nameCompany = sc.next();

                System.out.print("Anual Income: ");
                Double annualIncomeCompany = sc.nextDouble();

                System.out.print("Number of Employeers: ");
                Integer numberEmployeerCompany = sc.nextInt();

                list.add(new Company(nameCompany,annualIncomeCompany,numberEmployeerCompany));

            } else if (options.equals("i")) {

                System.out.print("Name: ");
                String nameIndividual = sc.next();

                System.out.print("Annual Income: ");
                Double annualIncomeIndividual = sc.nextDouble();

                System.out.print("Health Expenditures: ");
                Double healthExpensesIndividual = sc.nextDouble();

                list.add(new Individual(nameIndividual,annualIncomeIndividual,healthExpensesIndividual));

            }

        }

        System.out.println();

        System.out.println("TAXES PAID: ");

        double totalTaxes = 0;

        for (Person p : list){
            System.out.println(p.getName() + ": $ " + p.impost());
            totalTaxes+= p.impost();
        }

        System.out.println();

        System.out.print("TOTAL TAXES : $" + totalTaxes);

        sc.close();
    }
}

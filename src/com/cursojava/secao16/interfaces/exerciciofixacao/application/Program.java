package com.cursojava.secao16.interfaces.exerciciofixacao.application;



import com.cursojava.secao16.interfaces.exerciciofixacao.model.entities.Contract;
import com.cursojava.secao16.interfaces.exerciciofixacao.model.entities.Installment;
import com.cursojava.secao16.interfaces.exerciciofixacao.service.ContractService;
import com.cursojava.secao16.interfaces.exerciciofixacao.service.PaypalService;

import java.text.ParseException;


import java.time.LocalDate;


import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");

        System.out.print("Número: ");
        int number = sc.nextInt();

        System.out.print("Data(dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(),dtf);

        System.out.print("Valor do Contrato: ");
        Double valueTotal = sc.nextDouble();

        Contract obj = new Contract(number,date,valueTotal);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(obj,n);

        System.out.println("Parcelas:");

        for (Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }

        sc.close();

    }
}

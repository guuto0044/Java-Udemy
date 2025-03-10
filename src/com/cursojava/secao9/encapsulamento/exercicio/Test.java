package com.cursojava.secao9.encapsulamento.exercicio;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        String numberAccount = scanner.nextLine();

        System.out.println("Enter Account Holder: ");
        String nameClient = scanner.nextLine();

        BankAccount c1 = new BankAccount(numberAccount,nameClient,0);

        System.out.println("Account Data:");
        System.out.println(c1);

        while (true) {

            System.out.println("Press [d] - Deposit | Press [w] - Whitdraw | [e] - Exit: ");
            String options = scanner.next();
            if (Objects.equals(options, "d")) {
                System.out.println("Enter Deposit Value: ");
                c1.deposit(scanner.nextDouble());
            } else if (Objects.equals(options, "w")) {
                System.out.println("Enter a Withdraw Value: ");
                c1.whithdraw(scanner.nextDouble());
            } else if (Objects.equals(options,"e")) {
                break;
            }

            System.out.println("Update Account Data:");
            System.out.println(c1);

        }

        scanner.close();
    }
}

package com.cursojava.secao13.exercicioresolvido.application;

import com.cursojava.secao13.exercicioresolvido.entities.Employee;
import com.cursojava.secao13.exercicioresolvido.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        Integer n = sc.nextInt();

        List<Employee>list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.print("Outsoured(y/n)? ");
            String outSourced = sc.next();

            if (outSourced.equals("n")){

                System.out.print("Name: ");
                String nameEmployee = sc.next();

                System.out.print("Hours: ");
                Integer hoursEmployee = sc.nextInt();

                System.out.print("Value per hour: ");
                Double valuePerHourEmployee = sc.nextDouble();

                Employee employee1 = new Employee(nameEmployee,hoursEmployee,valuePerHourEmployee);

                list.add(employee1);

            } else if (outSourced.equals("y")) {

                System.out.print("Name: ");
                String nameEmployee = sc.next();

                System.out.print("Hours: ");
                Integer hoursEmployee = sc.nextInt();

                System.out.print("Value per hour: ");
                Double valuePerHourEmployee = sc.nextDouble();

                System.out.print("Additional charge: ");
                Double additionalChargeEmployee = sc.nextDouble();

                Employee employee2 = new OutsourceEmployee(nameEmployee,hoursEmployee,valuePerHourEmployee,
                        additionalChargeEmployee);

                list.add(employee2);
            }
        }

        System.out.println("PAYMENTS: ");
        for (Employee e : list){
            System.out.println(e.toString());
        }

        sc.close();
    }
}

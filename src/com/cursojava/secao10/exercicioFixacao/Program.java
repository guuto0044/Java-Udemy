package com.cursojava.secao10.exercicioFixacao;

import java.util.*;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many employees will be Registered: ");
        int n = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Emplyoee #" + (i + 1));

            System.out.println("Id: ");
            int id = sc.nextInt();

            while (hasId(employeeList, id)) {
                System.out.println("Id alrady Taken! Repeat: ");
                id = sc.nextInt();
            }

            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();


            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            Employee employed = new Employee(id, name, salary);

            employeeList.add(employed);
        }

        System.out.println("Enter the employee id that have salary increase: ");
        int idVerify = sc.nextInt();

        boolean found = employeeList.stream().anyMatch(x -> x.getId() == idVerify);

        if (found) {
            System.out.println("Enter the Percent: ");
            int employeeIndex = position(employeeList, idVerify);
            if (employeeIndex != -1) {
                Employee employee = employeeList.get(employeeIndex);
                double percent = sc.nextDouble();
                employee.incrasseSalary(percent);
            }

        }

        if (!found) {
            System.out.println("This Id does not exist!");
        }


//        Integer pos = position(employeeList,idSalary);

//        if (pos == null){
//            System.out.println("This id not Exist!");
//        } else {
//            System.out.println("Enter the Percent: ");
//            double percent = sc.nextDouble();
//            employeeList.get(pos).incrasseSalary(percent);
//        }

        System.out.println("List of Employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}

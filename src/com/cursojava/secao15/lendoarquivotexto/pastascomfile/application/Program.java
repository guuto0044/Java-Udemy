package com.cursojava.secao15.lendoarquivotexto.pastascomfile.application;

import java.io.*;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
//        Filtra as Pastas e arquivos
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders: "); // Lista das pastas
        for (File folder: folders){
            System.out.println(folder);
        }

        File [] files = path.listFiles(File::isFile);

        System.out.println("Files:"); // Lista de Arquivos
        for (File file : files){
            System.out.println(file);
        }

        boolean success = new File(strPath + "//subpast").mkdir(); // Cria uma subpasta
        System.out.println("Directory created successfully: " + success);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());


        sc.close();
    }
}








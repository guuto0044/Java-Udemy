package com.cursojava.secao15.lendoarquivotexto.filescanner.application;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

//         File - Representção abstrata de um arquivo e seu caminho.
//        Scanner - Leitor de Texto
//        IOException - Exeception

        File file = new File("/Users/user-name/.../...");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.print(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }
}

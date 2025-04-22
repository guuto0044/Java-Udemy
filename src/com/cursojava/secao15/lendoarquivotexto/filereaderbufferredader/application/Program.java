package com.cursojava.secao15.lendoarquivotexto.filereaderbufferredader.application;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

//        BufferReder: Implementa otimizações.
//        FileReader: Sequencia de leitura a partir de um arquivo.

        String path = "/Users/.../.../...";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); // Lê uma linha do arquivo.

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

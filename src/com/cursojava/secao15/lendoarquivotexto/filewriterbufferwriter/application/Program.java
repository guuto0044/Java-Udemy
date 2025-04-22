package com.cursojava.secao15.lendoarquivotexto.filewriterbufferwriter.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    //  Realiza a escrita
    //  FileWriter:
    //  BufferedWriter

    public static void main(String[] args) {

        String [] lines = new String[] {"Hey it's a text", "Good Afternoon", "Good Night"};

        String path = "/Users/.../.../...";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){  // Garante que não vai recriar o arquivo.

            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
}

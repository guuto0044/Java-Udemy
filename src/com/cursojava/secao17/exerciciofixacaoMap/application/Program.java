package com.cursojava.secao17.exerciciofixacaoMap.application;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

//        String path = "/Users/augustocesarsouza/Documents/exemplo2.txt";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        File strPath = new File(path);

        Map<String,Integer> votes = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();

            while (line != null){
                String [] fields = line.split(",");
                String name = fields[0];
                Integer vote = Integer.parseInt(fields[1]);
                if (votes.containsKey(name)){
                    Integer votesSoFar = votes.get(name);
                    votes.put(name, vote + votesSoFar);
                } else {
                    votes.put(name, vote);
                }
                line = br.readLine();
            }

            for (String key : votes.keySet()){
                System.out.println(key + ": " + votes.get(key));
            }

        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }

    }
}

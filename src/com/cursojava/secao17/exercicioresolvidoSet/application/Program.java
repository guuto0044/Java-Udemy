package com.cursojava.secao17.exercicioresolvidoSet.application;


import com.cursojava.secao17.exercicioresolvidoSet.entities.Users;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

//      String path = "/Users/augustocesarsouza/Documents/exemplo1.txt";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String strPath = sc.next();

        File path = new File(strPath);

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<Users> hashSet = new HashSet<>();

            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date date = Date.from(Instant.parse(fields[1]));
                hashSet.add(new Users(username, date));
                line = br.readLine();
            }

            System.out.print("Total users: " + hashSet.size());


        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}

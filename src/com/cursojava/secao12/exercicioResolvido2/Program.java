package com.cursojava.secao12.exercicioResolvido2;

import com.cursojava.secao12.exercicioResolvido2.entities.Comment;
import com.cursojava.secao12.exercicioResolvido2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Locale;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("WOW! that awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zeland",
                "I'm going to visit this wonderful country!",12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}

package com.libro.deitel.capitulo4;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        
        String sentence = "Hola a todos como estan, espero que bien.";
        //Con esta clase lo que hago es hacer la frase sentence en tokens osea en pedacitos

        StringTokenizer st = new StringTokenizer(sentence);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}

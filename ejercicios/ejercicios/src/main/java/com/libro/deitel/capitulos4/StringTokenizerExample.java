package com.libro.deitel.capitulos4;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        
        String sentence = "Hola a todos como estan, espero que bien.";

        StringTokenizer st = new StringTokenizer(sentence);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}

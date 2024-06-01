package com.libro.deitel.capitulo5;

public class Ejercicio512 {
    public static void main(String[] args) {
        
        for(int i = 1; i <= 15; i+=2){
            for(int j = 1; j <= 10 ; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}

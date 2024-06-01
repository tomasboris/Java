package com.libro.deitel.capitulo5;

public class Ejercicio524 {
    public static void main(String[] args) {
        for(int linea = 1; linea <= 5; linea++){

            for(int i = 5 ; i >=linea; i--){
                System.out.print(" ");
    
            }
            for(int j = 2; j <= linea*2; j+=2){
                System.out.print("*");
            }
            System.out.println();


        }
        
    }
}

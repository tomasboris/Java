package com.libro.deitel.capitulo5;

public class Ejercicio513 {
    public static void main(String[] args) {
        
        
        long factorial = 1; 
        int numeros;

        for(numeros = 1 ; numeros <=20; numeros++){

            for(int i = 1; i <=numeros ; i++){
                factorial = (long)(factorial * i);
            }
            System.out.println("Factorial de " + numeros + " es " + factorial);


        }

        
    }
}

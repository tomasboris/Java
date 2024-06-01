package com.libro.deitel.capitulo5;

public class Ejercicio53 {
    
    public static void main(String[] args) {
        //Ejercicio a
        int suma = 0;
        for(int numero =1 ; numero <= 99; numero+=2){

            suma = suma + numero ;
        }
        System.out.println(suma);
        // Ejercicio b
        double a = 2.5;
        double b;
        b = Math.pow(a, 3);
        System.out.println(b);
        // Ejercicio c
        int i = 1;
        while ( i<=20 ) {
            System.out.print(i);
            System.out.print('\t');
            
            if ( i % 5 == 0){
                System.out.println();
            }
            
            i++;
            
        }
        



    }
}

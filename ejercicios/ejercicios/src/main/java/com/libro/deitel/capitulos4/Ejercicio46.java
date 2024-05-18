package com.libro.deitel.capitulos4;

public class Ejercicio46 {
    public static void main(String[] args) {
        //Suma de numeros del 1 al 10 
        int x = 0;
        int suma = 0;

        while (x <= 10) {
            suma = x + suma ;
            x++;
            
        }
        System.out.println("Valor de x : " + x );
        System.out.println("Valor de suma : " + suma);
    }
}

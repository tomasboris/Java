package com.libro.deitel.capitulo5;

public class Ejercicio55 {
    public static void main(String[] args) {
        int suma = 0;
        for(int contador = 2; contador <= 20 ; contador+=2){
            suma = contador + suma;
        }
        System.out.println(" La suma es : " + suma);
    }
}

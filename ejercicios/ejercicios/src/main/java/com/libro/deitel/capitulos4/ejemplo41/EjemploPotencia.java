package com.libro.deitel.capitulos4.ejemplo41;

public class EjemploPotencia {
    public static void main(String[] args) {
        
        int multi = 1 ;
        int producto = 0;
        while ( producto <=100) {
            
            producto = 3 * multi;
            multi++;
            System.out.println("Valor de producto " +producto);
            
        }
        System.out.println("Valor final : " +producto);
        System.out.println("Valor para saber cuantas veces ingreso a la repeticion : " +multi);
    }
}

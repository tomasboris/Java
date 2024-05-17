package com.libro.deitel.capitulos4.ejemplo41;

import java.util.Scanner;

public class Ejemplo49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        double promedio;

        System.out.println("Ingrese 10 notas ");

        int ingreso = 0;
        int sumaNotas = 0;
        while (ingreso < 10) {
            
            System.out.println("Ingrese la nota numero " + (ingreso + 1));
            nota = sc.nextInt();
            sumaNotas = sumaNotas + nota;
            ingreso++;

        }
        System.out.println("Valor ingreso a la salida " +ingreso);
        promedio = sumaNotas/(ingreso);
        System.out.println("Promedio : " +promedio);
    }
    
}

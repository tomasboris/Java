package com.libro.deitel.capitulo1;

import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        // en este ejercicio, voy a sumar dos numeros y pedir la informacion con la clase scanner

        int a,b;
        int suma;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Por favor ingrese dos numeros");
            a = sc.nextInt();
            b = sc.nextInt();
            suma = a + b;
        System.out.println("La suma de los dos numeros es = " +suma);
        }
        

    }
}

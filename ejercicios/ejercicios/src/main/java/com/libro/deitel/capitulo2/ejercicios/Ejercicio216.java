package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio216 {
    public static void main(String[] args) {
        
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero ");
        b = sc.nextInt();
        if (a>b) {
            System.out.println("El numero " + a +" es el mas grande ");
        }else{
            System.out.println("El numero " + b + " es el mas grande");
        }
        if (a == b) {
            System.out.println("Los numero son iguales");
        }


    }
}

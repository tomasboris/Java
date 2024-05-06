package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Ingrese un numero ");
        a = sc.nextInt();
        System.out.println("Ingrese un numero ");
        b = sc.nextInt();
        //ahora veo si el primero es multiplo del segundo 
        if ((a % b) ==0 ){
            System.out.println("El numero " + a + " es multiplo de " + b);
        }else{
            System.out.println("El primero no es multiplo del segundo ");
        }
    }
}

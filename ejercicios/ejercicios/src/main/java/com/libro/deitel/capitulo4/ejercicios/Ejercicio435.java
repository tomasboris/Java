package com.libro.deitel.capitulo4.ejercicios;

import java.util.Scanner;

public class Ejercicio435 {
    public static void main(String[] args) {
        System.out.println("Ingrese 3 lados de un triangulo");
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ( (a +b) > c && (a + c) > b && (b + c) > a) {
            System.out.println( " Es un triangulo");
            
        }else{
            System.out.println(" No es un triangulo");
        }
    }
}

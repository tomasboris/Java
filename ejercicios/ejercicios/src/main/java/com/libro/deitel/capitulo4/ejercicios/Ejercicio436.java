package com.libro.deitel.capitulo4.ejercicios;

import java.util.Scanner;

public class Ejercicio436 {
    public static void main(String[] args) {

        // Saber si se puede construir un rectangulo con 3 lados
        Scanner sc = new Scanner(System.in);
        System.out.println( "Ingrese los tres valores");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ((a * a + b * b) == (c * c)) {
            System.out.println("Es triangulo rectangulo");

        } else if ((a * a + c * c) == (b * b)) {
            System.out.println("Es triangulo rectangulo");

        } else if ((c * c + b * b) == (a * a)) {
            System.out.println("Es triangulo rectangulo");

        } else {
            System.out.println("No es triangulo rectangulo");
        }

    }
}

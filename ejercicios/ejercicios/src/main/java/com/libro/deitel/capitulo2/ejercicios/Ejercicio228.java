package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio228 {
    public static void main(String[] args) {

        // Ahora voy hacer un ejercicio de una circunferencia donde se le pide al usuario el radio
        Scanner sc = new Scanner(System.in);
        int radio;
        System.out.println("Ingrese el radio de la circunferencia");
        radio = sc.nextInt();
        System.out.println(" El diametro es : " + 2*radio);
        System.out.println("El perimetro es : " + 2 * Math.PI * radio);
        System.out.println("El area del circulo es : " +Math.PI * Math.pow(radio,2));
        System.out.println("Fin del programa ");
        System.out.println("Viendo el valor de la variable A");
        System.out.println("A es : " +((int)'A'));

    }
}

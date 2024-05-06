package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a, b, c, d, e;
        System.out.println("Ingrese un numero compuesto por 5 digitos ");
        num = sc.nextInt();
        if (num > 9999 && num < 9999) {

            a = num / 10000;
            b = (num / 1000) % 10;
            c = (num / 100) % 10;
            d = (num / 10) % 10;
            e = num % 10;
            System.out.println(a + "   " + b + "   " + c + "   " + d + "   " + e);

        }
        if (num > 99999) {
            System.out.println("Numero mayor que 5 digitos no puede seguir");

        }
        if (num < 9999) {
            System.out.println("Numero menor a 5 digitos no puede seguir");
        }

    }
}

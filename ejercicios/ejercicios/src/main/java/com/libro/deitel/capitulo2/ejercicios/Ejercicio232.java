package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        System.out.println("Escriba 5 numeros positivos o negativos .Tambien puede estar el cero");
        System.out.println("Ingrese el primer nuemro ");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero ");
        b =sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        c = sc.nextInt();
        System.out.println("Ingrese el cuarto numero");
        d = sc.nextInt();
        System.out.println("Ingrese el quinto numero ");
        e = sc.nextInt();
        if (a < 0) {
            negativos++;
        }
        if (a == 0) {
            ceros++;
        }
        if (a > 0) {
            positivos++;
        }
        if (b < 0) {
            negativos++;
        }
        if (b == 0) {
            ceros++;
        }
        if (b > 0) {
            positivos++;
        }
        if (c < 0) {
            negativos++;
        }
        if (c == 0) {
            ceros++;
        }
        if (c > 0) {
            positivos++;
        }
        if (d < 0) {
            negativos++;
        }
        if (d == 0) {
            ceros++;
        }
        if (d > 0) {
            positivos++;
        }
        if (e < 0) {
            negativos++;
        }
        if (e == 0) {
            ceros++;
        }
        if (e > 0) {
            positivos++;
        }
        System.out.println("La cantidad de ceros es = " + ceros);
        System.out.println("La cantidad de negativos es = " + negativos);
        System.out.println("La cantidad de positivos es = " + positivos);
    }
}

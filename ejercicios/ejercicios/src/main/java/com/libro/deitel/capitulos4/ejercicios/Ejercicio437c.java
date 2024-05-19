package com.libro.deitel.capitulos4.ejercicios;

import java.util.Scanner;

public class Ejercicio437c {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = sc.nextInt();
        int numeroFinal = numero;
        int factorial = 1;
        double eIncompleto = 0;
        double eCompleto;

        if (numero >= 1) {

            while (numero >= 1) {

                factorial = numero * factorial;
                eIncompleto = (double) (Math.pow(numero, numero) / factorial) + eIncompleto;
                numero--;

            }
            eCompleto = eIncompleto + 1;
            System.out.println("Factorial de " + numeroFinal + " es = " + factorial);
            System.out.println("La constante e elevado al numero ingresado = " + eCompleto);

        } else {
            System.out.println("Tiene que ingresar un numero positivo");
        }
    }
}

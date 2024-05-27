package com.libro.deitel.capitulo5;

import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {

        int aContador = 0;
        int bContador = 0;
        int cContador = 0;
        int dContador = 0;
        int eContador = 0;
        int fContador = 0;
        int contadorTotal = 0;
        int contadorCali = 1;
        int calificacion;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las calificaciones del 100 a 0 ");
        System.out.println("Pulse control + d para poder salir del programa");
        while (sc.hasNext()) {
            calificacion = sc.nextInt();
            contadorTotal = contadorCali + contadorTotal;
            contadorCali++;

            // Ahora lo que tengo que hacer es un comando switch para hacer el cambio de
            // calificaciones
            switch (calificacion / 10) {
                case 10:
                case 9:
                    aContador = aContador + 1;
                    break;
                case 80:
                    bContador = bContador + 1;

                    break;
                case 70:
                    cContador = cContador + 1;

                    break;
                case 60:
                    dContador = dContador + 1;

                    break;
                case 50:
                    eContador = eContador + 1;

                    break;
                default:
                    fContador = fContador + 1;
                    break;
            }
        }
        if (contadorCali != 1) {

            System.out.println("La cantidad de notas A son = " + aContador);
            System.out.println("La cantidad de notas B son = " + bContador);
            System.out.println("La cantidad de notas C son = " + cContador);
            System.out.println("La cantidad de notas D son = " + dContador);
            System.out.println("La cantidad de notas E son = " + eContador);
            System.out.println("La cantidad de notas F son = " + fContador);

        } else {
            System.out.println("No ingreso ninguna nota saludos");
        }

    }
}

package com.libro.deitel.capitulos4.ejercicios;

import java.util.Scanner;

public class Ejercicio419 {

    public static void main(String[] args) {
        int semana = 1;
        int articulo = 0;
        double a1 = 239.99, a2 = 129.75, a3 = 99.95, a4 = 350.89;
        double totalSemana = 0;
        int bono = 200;
        double porcentajeSemana;
        double semanaTotalConBono;
        double acumuladorSemanal = 0;
        Scanner sc = new Scanner(System.in);

        while (semana <= 4) {
            System.out.println("Ingrese los articulos del 1 al 4 de la semana numero " + semana);
            while (articulo != -1) {
                System.out.println("Colocar -1 para salir ");
                articulo = sc.nextInt();
                if (articulo == 1 || articulo == 2 || articulo == 3 || articulo == 4) {

                    if (articulo == 1) {
                        totalSemana = totalSemana + a1;

                    } else if (articulo == a2) {
                        totalSemana = totalSemana + a2;

                    } else if (articulo == a3) {
                        totalSemana = totalSemana + a3;

                    } else if (articulo == a4) {
                        totalSemana = totalSemana + a4;
                    }

                } else {
                    System.out.println("Coloco -1 o otro numero que no es del 1 al 4");
                }
                semana++;

            }
            porcentajeSemana = totalSemana * 0.09;
            System.out.println("El porcentaje de la semana es : " + porcentajeSemana);
            semanaTotalConBono = porcentajeSemana + bono;
            acumuladorSemanal = acumuladorSemanal + semanaTotalConBono;

        }

        System.out.println("A fin de mes el vendedor gano = " + acumuladorSemanal);

    }
}

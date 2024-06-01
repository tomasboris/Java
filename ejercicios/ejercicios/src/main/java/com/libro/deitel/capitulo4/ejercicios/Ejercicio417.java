package com.libro.deitel.capitulo4.ejercicios;

import java.util.Scanner;

public class Ejercicio417 {
    public static void main(String[] args) {
        int kilo = 0, litro;
        double totalkilometros = 0;
        int totalLitros = 0, viaje = 1;
        Scanner sc = new Scanner(System.in);

        while (kilo != -1) {

            System.out.println("Viaje numero = " + viaje);
            System.out.println("Ingrese la cantidad de kilometros");
            kilo = sc.nextInt();
            System.out.println("Ingrese la cantidad de litros");
            litro = sc.nextInt();
            if (kilo > -1) {

                double kiloPorLitro = (double) kilo / (double) litro;
                System.out.println("En este viaje se avanzo " + kiloPorLitro + " kilometros por litro");
                totalkilometros = totalkilometros + kiloPorLitro;
            }

            viaje++;

        }
        System.out.println("Total de kilometros por litro = " + totalkilometros);

    }
}

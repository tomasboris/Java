package com.libro.deitel.capitulo2;

import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        /* comparando numeros con un comparador if y utilizando la clase scanner */
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese dos numeros ");
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == b) {
                System.out.println("Los dos numeros son iguales");
            }
            if (a != b) {
                System.out.println("El primero es distinto del  mayor");
            }
            if (a < b) {
                System.out.println("El primero es el menor");
            }
            if (a > b) {
                System.out.println("El primero es el mayor");
            }
            if (a <= b) {
                System.out.println("El primero es menor o igual que el segundo ");
            }
            if (a >= b) {
                System.out.println("El primero es el mayor o igual que el segundo");
            }
        }
        

    }
    
}

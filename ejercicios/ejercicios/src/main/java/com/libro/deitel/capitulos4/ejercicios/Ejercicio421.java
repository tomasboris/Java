package com.libro.deitel.capitulos4.ejercicios;

import java.util.Scanner;

public class Ejercicio421 {
    public static void main(String[] args) {
        int contador = 1;
        int numero;
        int mayor = -10000;

        Scanner sc = new Scanner(System.in);
        while (contador <= 10) {
            System.out.println("Ingrese un numero ");
            numero = sc.nextInt();
            if (numero > mayor){
                mayor = numero;

            }
            contador++;
            
        }
        System.out.println("El numero mayor es el " +mayor);
    }
}

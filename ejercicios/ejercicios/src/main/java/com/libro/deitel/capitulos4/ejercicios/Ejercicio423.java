package com.libro.deitel.capitulos4.ejercicios;

import java.util.Scanner;

public class Ejercicio423 {
    public static void main(String[] args) {

        int contador = 1;
        int numero;
        int mayor = -10000;
        int mayor2 = -10000;

        Scanner sc = new Scanner(System.in);
        while (contador <= 10) {
            System.out.println("Ingrese un numero ");
            numero = sc.nextInt();
            if (numero > mayor){
                mayor2 = mayor;
                mayor = numero;
                
                
            }
            
            contador++;
            
        }
        System.out.println("El numero mayor es el " +mayor);
        System.out.println("El segundo numero mayor es el = " +mayor2);
        
    }
}

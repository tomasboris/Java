package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio225 {
    public static void main(String[] args) {
        //ahora veo si un numero es par o impar 
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero ");
        numero = sc.nextInt();
        if ((numero % 2) == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
        
    }
}

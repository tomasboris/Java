package com.libro.deitel.capitulo5;

import java.util.Scanner;

public class Ejercicio511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int valor = Integer.MAX_VALUE;
        int aleatorio;
        
        System.out.println("Ingrese un numero ");
        numero = sc.nextInt();
        for(int i = 1; i <= numero ;i++){
            System.out.println("Ingrese un numero aleatorio entero");
            aleatorio = sc.nextInt();
            if (aleatorio < valor){
                valor = aleatorio;
            }

        }
        System.out.println("El valor menor es = " + valor);
    }
}

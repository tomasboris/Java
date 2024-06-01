package com.libro.deitel.capitulo5;

import java.util.Scanner;

public class Ejercicio516 {
    public static void main(String[] args) {
        //Programa para imprimir graficos de barra 
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese 5 numeros ");
        int n1,n2,n3,n4,n5;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();

        for(int i = 1; i <= n1 ; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= n2 ; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= n3 ; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= n4 ; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1; i <= n5 ; i++){
            System.out.print("*");
        }
        System.out.println();
        
    }
}

package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {

        // Programa que calcula el producto de 3 numeros
        // creando un objeto scanner para que lea los valores
        Scanner sc = new Scanner(System.in);
        int x, y, z, resultado;
        System.out.println("Ingrese el primer entero");
        x = sc.nextInt();
        System.out.println("Ingrese el segundo entero");
        y = sc.nextInt();
        System.out.println("Ingrese el tercer entero");
        z = sc.nextInt();
        resultado = x * y * z;
        System.out.println("El resultado es : " + resultado);

    }
}

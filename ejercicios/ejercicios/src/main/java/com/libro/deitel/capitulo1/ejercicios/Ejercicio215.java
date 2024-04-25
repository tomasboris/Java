package com.libro.deitel.capitulo1.ejercicios;

import java.util.Scanner;

public class Ejercicio215 {

    public static void main(String[] args) {

        int a,b,suma,resta,producto,cociente;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Estoy en el ejercicio numero 2.15 del libro de Deitel
        System.out.println("Ingrese primer numero ");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = sc.nextInt();
        suma = a +b ;
        System.out.println("La suma de los dos numeros es : " + suma);
        producto = a * b ;
        System.out.println("El producto de los dos numeros es : " + producto);
        resta = a - b ;
        System.out.println("La resta de los dos numeros es : " + resta);
        cociente = a / b;
        System.out.println("El cuociente de los dos numeros es :" + cociente);


        
    }
    
}

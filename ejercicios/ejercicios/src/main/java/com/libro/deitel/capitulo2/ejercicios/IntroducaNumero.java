package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class IntroducaNumero {
    
    public static void main(String[] args) {
        
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        System.out.println("El numero es : " + numero );
    }
}

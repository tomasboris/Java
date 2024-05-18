package com.libro.deitel.capitulos4.ejercicios;

import java.util.Scanner;

public class Ejercicio430 {
    public static void main(String[] args) {
        int contadoringresos = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 5 digitos ");
        int numero = sc.nextInt();
        int divi;

        while (contadoringresos <= 5) {
             divi = numero / 10;
             numero = divi;
             if(divi == 0 && contadoringresos == 5){
                System.out.println("Es un numero de 5 digitos");
             }
             contadoringresos++;
        }
        
    }
}

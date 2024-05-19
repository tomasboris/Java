package com.libro.deitel.capitulos4.ejercicios;

import java.util.Scanner;

public class Ejercicio437 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = sc.nextInt();
        int numeroFinal = numero;
        int factorial =1;

        if (numero >=1){

            while (numero >=1) {

                factorial = numero * factorial;

                numero --;
                
            }
            System.out.println("Factorial de " + numeroFinal + " es = " + factorial);

        }else{
            System.out.println("Tiene que ingresar un numero positivo");
        }
        
    }
}

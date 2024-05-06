package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio233 {
    public static void main(String[] args) {
        // Esta es una calculadora del indice corporal
        Scanner sc = new Scanner(System.in);
        int peso;
        double altura;
        System.out.println("Ingrese su peso en kilogramos");
        peso = sc.nextInt();
        System.out.println("Ingrese su altura");
        altura = sc.nextDouble();
        double bmi;
        bmi = peso / Math.pow(altura, 2);
        System.out.println("Valores del bmi");
        if (bmi < 18.5) {
            System.out.println("Bajo peso");

        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");

        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Sobrepeso");

        } else {
            System.out.println("Obeso");
        }

    }
}

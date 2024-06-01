package com.libro.deitel.capitulo4.ejercicios;

import java.util.Scanner;

public class Ejercicio420 {
    public static void main(String[] args) {
        
        int empleado = 1;
        int cuotaNormal;
        int cuotaYMedia;
        int numeroHoras;
        int sueldoBruto;
        

        Scanner sc = new Scanner(System.in);

        while (empleado <=3) {
            System.out.println("Ingrese la cantidad de horas del empleado " + empleado);
            numeroHoras = sc.nextInt();
            System.out.println("Valor hora hasta las 40 horas");
            cuotaNormal = sc.nextInt();
            System.out.println("Valor hora mas de 40 horas ");
            cuotaYMedia = sc.nextInt();
            int resto = numeroHoras - 40;
            int totalCuarenta = 40 * cuotaNormal;
            int totalSobre = resto * cuotaYMedia;
            sueldoBruto = totalCuarenta + totalSobre;
            System.out.println("Sueldo del empleado numero " + empleado +" es : " +sueldoBruto);
            empleado++;
            
        }
    }
}

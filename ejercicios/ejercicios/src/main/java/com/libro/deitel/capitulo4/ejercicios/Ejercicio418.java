package com.libro.deitel.capitulo4.ejercicios;

import java.util.Scanner;

public class Ejercicio418 {
    public static void main(String[] args) {
        int numeroCuenta = 0;
        int saldoInicioMes;
        int totalArticulos = 0, valorArticulo = 0;
        int totalCreditos = 0, valorCredito = 0;
        int limiteCreditoPermitido = 5000;
        int saldoFinal;
        int mes = 0;
        Scanner sc = new Scanner(System.in);

        while (numeroCuenta != -1) {
            System.out.println("Ingrese el numero de cuenta poner -1 para salir");
            numeroCuenta = sc.nextInt();
            if (numeroCuenta > 0) {
                System.out.println("Ingrese el saldo de inicio de mes ");
                saldoInicioMes = sc.nextInt();
                
                // Aqui ingreso una cantidad de articulos hasta colocar -1
                while (valorArticulo != -1) {
                    System.out.println("Ingrese el valor del articulo -1 para salir");
                    valorArticulo = sc.nextInt();
                    totalArticulos = totalArticulos + valorArticulo;
                }
                while (valorCredito != -1) {
                    System.out.println("Valor del credito -1 para salir");
                    valorCredito = sc.nextInt();
                    totalCreditos = totalCreditos + valorCredito;
                    
                }
                if (totalCreditos <= limiteCreditoPermitido) {
                    saldoFinal = saldoInicioMes +totalArticulos - totalCreditos;
                    System.out.println("El saldo final es = " +saldoFinal);
                    
                }else{System.out.println("Hay un problema con el credito se sobre paso");}
                
            }

        }
    }
}

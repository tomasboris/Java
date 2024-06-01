package com.libro.deitel.capitulo5;

import java.util.Scanner;

public class Ejercicio517 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int numero = 1;
        double valor;
        int cantidad;
        double valorTotal;
        int a = 0,b = 0,c = 0,d = 0,e = 0;
        double total1 = 0,total2 = 0,total3 = 0,total4 = 0,total5 = 0;

        while ( numero != 0) {
            System.out.println("Ingrese un numero del 1 al 5 para salir coloque 0");
            numero = sc.nextInt();

            if (numero >=1 && numero <= 5) {
                switch (numero) {
                    case 1:
                        valor = 2.98;
                        total1 = total1 + valor;
                        a++;
                        break;
                    case 2:
                        valor = 4.50;
                        total2 = total2 + valor;
                        b++;
                        break;
                    case 3:
                        valor = 9.98;
                        total3 = total3 + valor;
                        c++;
                        break;
                    case 4:
                        valor = 4.49;
                        total4 = total4 + valor;
                        d++;
                        break;
                    case 5:
                        valor = 6.87;
                        total5 = total5 + valor;
                        e++;
                        break;
                
                    default:
                        System.out.println("Valor erroneo");
                        break;
                }
                System.out.println("Producto 1 Cantidad = " + a + " total vendido en 1 = " + total1 );
                System.out.println("Producto 2 Cantidad = " + b + " total vendido en 1 = " + total2 );
                System.out.println("Producto 3 Cantidad = " + c + " total vendido en 1 = " + total3 );
                System.out.println("Producto 4 Cantidad = " + d + " total vendido en 1 = " + total4 );
                System.out.println("Producto 5 Cantidad = " + e + " total vendido en 1 = " + total5 );
                double totalFinal = total1 + total2 + total3 + total4 + total5;
                System.out.println("Total final = " +totalFinal);
                
            }else{
                System.out.println("No es un numero entre 1 y 5");
            }
            
        }
        
    }
}

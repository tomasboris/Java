package com.libro.deitel.capitulo2.ejercicios;

import java.util.Scanner;

public class Ejercicio217 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b,c,suma,promedio,producto,menor,mayor;
        System.out.println("Ingrese el primer numero");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = sc.nextInt();
        System.out.println("Ingrese el tercer numero ");
        c = sc.nextInt();
        suma = a + b + c;
        System.out.println("La suma de los numeros es = " + suma);
        promedio = suma/3;
        System.out.println("El promedio de los 3 numeros es = " + promedio);
        producto = a * b * c;
        System.out.println("El producto de los 3 numeros es = " + producto);
        // para ir comparando numeros con if para el menor
        
        if(a < b){
            if (a < c)
            {
                System.out.println("El numero " + a + " es el menor");
            }
        }
        if(b < a){
            if (b < c)
            {
                System.out.println("El numero " + b + " 53es el menor");
            }
        }
        if(c < a){
            if (c < b)
            {
                System.out.println("El numero " + c + " es el menor");
            }
        }
        //ahora para el tema del mayor se hace el mismo codigo pero al revez
        if(a > b){
            if (a > c)
            {
                System.out.println("El numero " + a + " es el mayor");
            }
        }
        if(b > a){
            if (b > c)
            {
                System.out.println("El numero " + b + " es el mayor");
            }
        }
        if(c > a){
            if (c > b)
            {
                System.out.println("El numero " + c + " es el mayor");
            }
        }


    }
}

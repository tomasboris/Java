package com.libro.deitel.capitulos4;

import java.util.Scanner;

public class ControlAnidado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entrada;
        int contador1 = 0;
        int contador2 = 0;
        int contador = 0;
        String mensaje = "";

        while (contador < 10) {
            System.out.println("Ingrese la calificacion numero " + (contador + 1));
            entrada = sc.nextInt();
            if (entrada == 1 || entrada == 2) {
                if (entrada == 1) {
                    contador1 = contador1 + 1;
                    
                }else{
                    contador2 = contador2 + 1;
                }
                
            }else{
                System.out.println("No corresponde");
                contador = contador -1;
            }
            contador++;
            
        }

        if (contador1 >= 8) {
            mensaje = "El instructor tiene un bono";
        }else{
            mensaje = "El instructor no tiene bono";
        }
        System.out.println("El contador termino en = " +contador);
        System.out.println("El numero de aprobados es = " + contador1);
        System.out.println("El numero de reprobados es = " + contador2);
        System.out.println(mensaje);



        
    }
}

package com.libro.deitel.capitulo5;

public class Ejercicio521 {
    public static void main(String[] args) {
        int lado1,lado2,hipo;
        int combiTotales = 0;

        System.out.println("Los que cumplen son :");
        System.out.println("Lado1  Lado2  Hipotenusa");
        for(lado1 = 1;lado1 <= 500; lado1++){
            for(lado2 = 1; lado2 <= 500; lado2++){
                for(hipo = 1; hipo <= 500 ; hipo++){
                    if ((lado1*lado1 + lado2*lado2) == hipo*hipo) {
                        System.out.println(lado1 + " " + lado2 + " = " +hipo);
                        combiTotales = combiTotales + 1;
                    }
                    
                }
            }
        }
        System.out.println("Combinaciones totales = " +combiTotales);
        
    }
}

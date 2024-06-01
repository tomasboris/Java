package com.libro.deitel.capitulo5;

public class BreakEjercicio {
    public static void main(String[] args) {
        int cuenta;
        for(cuenta = 1; cuenta <= 10; cuenta++){
            if (cuenta == 5) {
                continue;
                
            }
            System.out.println(cuenta);
        }
    }
}

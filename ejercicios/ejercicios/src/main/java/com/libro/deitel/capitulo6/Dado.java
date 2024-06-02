package com.libro.deitel.capitulo6;

import java.security.SecureRandom;
import java.util.Random;

public class Dado {
    
    public static void main(String[] args) {
        Random sr = new Random();
        
        //ahora hago los 20 tiros del dado , pero antes tengo que tener los contadores
        int conta1 = 0,conta2 = 0,conta3 = 0,conta4 = 0,conta5 = 0,conta6 = 0;
        for( long i = 1; i <= 100000000; i++){

            int lados = sr.nextInt(6) + 1;
            switch (lados) {
                case 1:
                    conta1 = conta1 +1;
                    break;
                case 2:
                    conta2 = conta2 +1;
                    break;
                case 3:
                    conta3 = conta3 +1;
                    
                    break;
                case 4:
                    conta4 = conta4 +1;
                    break;
                case 5:
                    conta5 = conta5 +1;
                    break;
                case 6:
                    conta6 = conta6 +1;
                    break;
            }

        }
        System.out.println("Cantidad de unos = " +conta1 );
        System.out.println("Cantidad de dos = " +conta2 );
        System.out.println("Cantidad de tres = " +conta3 );
        System.out.println("Cantidad de cuatro = " +conta4 );
        System.out.println("Cantidad de cinco = " +conta5 );
        System.out.println("Cantidad de seis = " +conta6 );
    }
}

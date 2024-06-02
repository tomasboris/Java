package com.libro.deitel.capitulo6;

import java.security.SecureRandom;

public class SecureRandomEje {
    public static void main(String[] args) {
        SecureRandom rd = new SecureRandom();
        byte miniArreglo[] = new byte[20];
        rd.nextBytes(miniArreglo);
        for (byte b : miniArreglo) {
            System.out.println(b);
        }

    }
}

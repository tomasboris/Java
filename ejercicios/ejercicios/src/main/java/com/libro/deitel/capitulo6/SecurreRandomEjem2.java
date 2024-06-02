package com.libro.deitel.capitulo6;

import java.security.SecureRandom;

public class SecurreRandomEjem2 {
    public static void main(String[] args) {
        SecureRandom aleatori = new SecureRandom();
        int num = aleatori.nextInt(8);
        System.out.println(num);
    }
}

package com.libro.deitel.capitulo3.ejercicios.ejercicio317;

import java.util.Calendar;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Calendar fr = Calendar.getInstance();
        System.out.println(fr.get(Calendar.YEAR));
        System.out.println(fr.get(Calendar.MONTH) + 1);
        System.out.println(fr.get(Calendar.DAY_OF_MONTH));
    }
}

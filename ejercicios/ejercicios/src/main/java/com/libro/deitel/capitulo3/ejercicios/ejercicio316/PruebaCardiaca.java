package com.libro.deitel.capitulo3.ejercicios.ejercicio316;

import java.util.Scanner;

public class PruebaCardiaca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        int dia,mes,anio;
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese el dia de su nacimiento");
        dia = sc.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        mes = sc.nextInt();
        System.out.println("Ingrese el anio de su nacimiento");
        anio = sc.nextInt();
        FrecuenciaCardiaca fr = new FrecuenciaCardiaca(nombre, apellido, dia, mes, anio);
        System.out.println( fr.getNombre() + " " + fr.getApellido());
        System.out.println("Fecha de nacimiento : " + fr.getDia() + "/" + fr.getMes() + "/" + fr.getAno());
        System.out.println("Edad : " + fr.getEdadAnos());
        System.out.println("Frecuencia cardiaca maxima : " + fr.getFrecuenciaMax());
        System.out.println("Rango Frecuencia cardiaca esperada : " + fr.getFrecuenciaEsperada50() + " y " + fr.getFrecuenciaEsperada80() );


    }
}

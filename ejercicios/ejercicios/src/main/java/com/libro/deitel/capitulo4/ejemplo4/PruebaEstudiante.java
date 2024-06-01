package com.libro.deitel.capitulo4.ejemplo4;

import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre;
        double promedio;
        Estudiante es = new Estudiante("Tomas",100);
        Estudiante es1 = new Estudiante("Juler", 10);

        System.out.println(es.getNombre() + " Promedio : " + es.getPromedio() + " Calificacion : " +es.getCalificacion());
        System.out.println(es1.getNombre() + " Promedio : " + es1.getPromedio() + " Calificacion : " +es1.getCalificacion());
        

        

    }
}

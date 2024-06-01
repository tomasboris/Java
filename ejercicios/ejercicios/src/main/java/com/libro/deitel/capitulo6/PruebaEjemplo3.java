package com.libro.deitel.capitulo6;

public class PruebaEjemplo3 {
    public static void main(String[] args) {
        Ejemplo3 p1 = Ejemplo3.creaInstanciasEjemplo3();
        p1.setEdad(23);
        p1.setNombre("Julius");

        System.out.println(p1.getEdad());
        System.out.println(p1.getNombre());
    }
}

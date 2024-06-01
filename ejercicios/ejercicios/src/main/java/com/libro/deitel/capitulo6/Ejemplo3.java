package com.libro.deitel.capitulo6;

public class Ejemplo3 {
    private String nombre;
    private int edad;

    private Ejemplo3() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // creando un metodo static para crea personar por que el constructor es privado
    public static Ejemplo3 creaInstanciasEjemplo3() {

        return new Ejemplo3();

    }
    
}

package com.libro.deitel.capitulo6;

public class Ejemplo1 {
    private static int contador = 0;
    public static final int constanteBoris = 8;



    public Ejemplo1(){
        contador++;
    }
    
    public static String diHola(){
        String mensaje = "Hola que tal ";
        return mensaje;
    }
    public static int contadorDeObjetos(){
        return contador;
    }
    public int getContador(){
        return contador;
    }
}

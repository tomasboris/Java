package com.libro.deitel.capitulo6;

public class Ejemplo1Prueba {
    
    public static void main(String[] args) {
        String mensaje = Ejemplo1.diHola();
        System.out.println(mensaje);
        // creando 4 objetos de prueba
        Ejemplo1 eje1 = new Ejemplo1();
        Ejemplo1 eje2 = new Ejemplo1();
        Ejemplo1 eje3 = new Ejemplo1();
        Ejemplo1 eje4 = new Ejemplo1();

        System.out.println("Cantidad de objetos = " +Ejemplo1.contadorDeObjetos());
        System.out.println(eje1.contadorDeObjetos());
        System.out.println(eje4.getContador());
    

    }
    
}

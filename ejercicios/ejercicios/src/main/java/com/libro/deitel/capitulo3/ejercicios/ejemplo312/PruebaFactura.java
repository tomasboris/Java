package com.libro.deitel.capitulo3.ejercicios.ejemplo312;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {

        Factura f1 = new Factura("Martillo", "Sirve para clavar clavos", 5, -3.98);
        System.out.println("Resumen de la factura ");
        System.out.println("Nombre Articulo : " + f1.getNumeroPieza());
        System.out.println("Descripcion : " + f1.getDescripcion());
        System.out.println("Cantidad : " + f1.getCantidad());
        System.out.println("Precio unitario : " + f1.getPrecio());
        System.out.println("Facturacion : " +f1.obtenerMontoFactura());
        System.out.println("Fin programa");
        
        
    }
}

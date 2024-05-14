package com.libro.deitel.capitulo3.ejercicios.ejemplo312;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double depo;
        double retira;
        System.out.println("Ingrese el nombre");
        Cuenta cu = new Cuenta("Nicola Gellona",123.98);//Ahora coloco el nombre por que se inicializa con el constructor
        Cuenta cu1 = new Cuenta("Marco Antonio",34.23);
        System.out.println("El nombre inicial es :"+cu.getNombre());
        System.out.println(cu.getNombre() +" Tiene = " +cu.getSaldo());
        System.out.println("El segundo nombre del objeto es :" +cu1.getNombre());
        System.out.println(cu1.getNombre() +"Tiene = " +cu1.getSaldo());
        System.out.println("Ingrese dinero a la cuenta de "+cu1.getNombre());
        depo = sc.nextDouble();
        cu1.depositar(depo);
        System.out.println("Ingrese dinero a la cuenta de "+cu.getNombre());
        depo = sc.nextDouble();
        cu.depositar(depo);
        System.out.println("Cuanto retira de la cuenta " +cu1.getNombre());
        retira = sc.nextDouble();
        cu1.retirarSaldo(retira);
        System.out.println(cu1.getNombre() +" Ahora tiene "+cu1.getSaldo());
        System.out.println(cu.getNombre() +" Ahora tiene "+cu.getSaldo());
        
    }
    
}

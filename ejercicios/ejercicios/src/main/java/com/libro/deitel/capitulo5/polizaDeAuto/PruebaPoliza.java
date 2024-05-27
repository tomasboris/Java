package com.libro.deitel.capitulo5.polizaDeAuto;

public class PruebaPoliza {
    public static void main(String[] args) {
        PolizaAuto p1 = new PolizaAuto(998000, "nissan v16", "Y");
        System.out.println(p1.getNumeroCuenta());
        System.out.println(p1.getMarcaYModelo());
        System.out.println(p1.getEstado());
        System.out.println(p1.esEstadoSinCulpa());
    }
}

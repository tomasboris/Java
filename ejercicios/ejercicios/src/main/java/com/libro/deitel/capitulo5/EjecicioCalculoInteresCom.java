package com.libro.deitel.capitulo5;

public class EjecicioCalculoInteresCom {
    public static void main(String[] args) {
        double cuenta = 0 ;
        double p = 1000.00;
        double r = 0.05;
    
        for(int n = 1; n <= 10 ; n++){
            double a = p * Math.pow((1 + r), n);
            cuenta = cuenta + a ;

        }
        System.out.println("Al final de los 10 anos el valor es " + cuenta);

        
    }
}

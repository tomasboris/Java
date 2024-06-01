package com.libro.deitel.capitulo6;

import java.util.Scanner;

public class Ejemplo2 {
    //las funciones o los metodos en la clase que tiene main se tienen que hacer fuera del main
    // ya que main tanbien es una funcion que esta fuera

    private int uno = 1;
    private String men = "hola desde instancia";

    

    public static void estatico(){
        Ejemplo2 ej2 = new Ejemplo2();

        int num = mayor(3, 5, 20);
        System.out.println(num + " Ahora el metodo de intancia " + ej2.dihola2() );

    }

    public String dihola2(){
        String mensaje = "Hola que tal desde un metodo de intancia";
        return mensaje;
    }
    public static int mayor(int a, int b, int c){
        int num = Math.max(a, b);
        int maxi = Math.max(num, c);
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Ejemplo2 ll = new Ejemplo2();
        int mayorNumero = mayor(a,b,c);
        System.out.println("El numero mayor de los 3 numeros es = " +mayorNumero);
        Ejemplo2.estatico();

        
    }
}

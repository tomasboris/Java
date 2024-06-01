package com.libro.deitel.capitulo5;

public class Ejercicio515 {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println();
        for(int a = 1 ; a <= 10 ; a++){
            for(int b = 1; b <= a; b++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("B");
        for(int a = 1 ; a <= 10 ; a++){
            for(int b =10 ; b >= a; b--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("C");
        for(int a = 1; a <= 10 ; a++){
            for(int c = 1; c < a; c++){

                System.out.print(" ");

            }
            for(int b = 10; b >=a ; b--){
                
                System.out.print("*");

            }
            System.out.println();
            
        }
        System.out.println();
        System.out.println("D");
        for(int a = 1; a <= 10 ; a++){
            for(int c = 10; c > a; c--){

                System.out.print(" ");

            }
            for(int b = 1; b <=a ; b++){
                
                System.out.print("*");

            }
            System.out.println();
            
        }

    }
    
}

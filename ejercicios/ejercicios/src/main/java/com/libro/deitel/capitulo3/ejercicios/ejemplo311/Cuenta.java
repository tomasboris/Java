package com.libro.deitel.capitulo3.ejercicios.ejemplo311;

public class Cuenta {

    private String nombre;// esto es una variable de instancia
    //Ahora voy a crear lo que es un constructor
    private double saldo;// esta variable la puedo usar en cualquier metodo
    public Cuenta(String nombre, double saldo){
        this.nombre = nombre; //osea esta instacia de atributo de la clase recibe una parametro de afuera 
        // para poder inicializarlo
        if (saldo > 0.0) { // Puedo colocar condiciones dentro de un constructor validaciones etc
            this.saldo = saldo;
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //haciendo un metodo que deposito
    public void depositar(double montoDeposito){
        if (montoDeposito > 0.0) {
            saldo = saldo + montoDeposito;
            
        }
    }
    //Metodo retirar saldo
    public void retirarSaldo(double retirar){
        if (retirar <= saldo) {
            saldo = saldo - retirar;
        }else{
            System.out.println("El monto a retirar excede el saldo de la cuenta de " +nombre);
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    

    
}

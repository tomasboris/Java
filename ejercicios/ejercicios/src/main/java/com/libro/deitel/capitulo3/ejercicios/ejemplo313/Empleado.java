package com.libro.deitel.capitulo3.ejercicios.ejemplo313;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado(String nombre, String apellido, double salario){

        this.nombre = nombre;
        this.apellido = apellido;
        if (salario < 0) {

            this.salario = (Double) null;

        }else{
            this.salario = salario;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    


    
}

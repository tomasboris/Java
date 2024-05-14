package com.libro.deitel.capitulo3.ejercicios.ejercicio317;

import java.util.Calendar;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura ;
    private double peso;
    private Calendar cal = Calendar.getInstance();

    // ahora el constructor de la clase con todos los datos
    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, double altura, double peso){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.altura = altura;
        this.peso = peso;

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    // ahora tengo la edad en anios de una forma correcta
    public int getAnios(){

        int edad;
        int anioActual = cal.get(Calendar.YEAR);
        int mesActual = cal.get(Calendar.MONTH + 1);
        int diaActual = cal.get(Calendar.DAY_OF_MONTH);

        if (dia == diaActual && mes == mesActual) {
            return edad = anioActual - anio;
        }else{
            return edad = anioActual - anio -1;
        }

    }
    //nota ahora se ingresan los mismos codigos de los ejercicios anteriores lo unico nuevo que agregue 
    // es el tema de los anios que estan mejor arreglados
    
    
}

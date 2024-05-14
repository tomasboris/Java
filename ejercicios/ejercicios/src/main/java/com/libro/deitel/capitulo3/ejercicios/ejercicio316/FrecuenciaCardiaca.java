package com.libro.deitel.capitulo3.ejercicios.ejercicio316;

import java.util.Calendar;

public class FrecuenciaCardiaca {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int ano;
    private Calendar cal = Calendar.getInstance();


    public FrecuenciaCardiaca(String nombre, String apellido, int dia, int mes, int ano){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    // Metodo para obtener la edad en anios de la persona
    public int getEdadAnos(){
        int anio = cal.get(Calendar.YEAR);
        return -(ano - anio);

    }
    //Metodo que devuelva la frecuencia cardiaca maxima de una persona 
    public int getFrecuenciaMax(){

        return -(getEdadAnos() - 220);

    }
    //Frecuencia esperada de una persona esta entre el 50 y 85 % de su frecuencia cardiaca maxima
    public double getFrecuenciaEsperada50(){

        double cincuenta = (getFrecuenciaMax() * 50)/100;
        return cincuenta;

    }
    //Frecuencia esperada de una persona esta entre el 50 y 85 % de su frecuencia cardiaca maxima
    public double getFrecuenciaEsperada80(){

        double ochentaYCinco = (getFrecuenciaMax() * 85)/100;
        return ochentaYCinco;
        

    }


    
}

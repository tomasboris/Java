package com.libro.deitel.capitulo3.ejercicios.ejercicio314;

public class Fecha {
    private int mes;
    private int dia;
    private int ano;

    public Fecha(int mes, int dia, int ano) {

        this.mes = mes;

        this.dia = dia;

        this.ano = ano;

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // metodo mostrar fecha mes/dia/ano
    public void mostrarFecha() {
        System.out.println(mes + "//" + dia + "//" + ano);
    }

}

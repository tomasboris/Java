package com.libro.deitel.capitulo5.polizaDeAuto;

public class PolizaAuto {

    private int numeroCuenta;  //Almacena el numero de cuenta de la poliza
    private String marcaYModelo; //Almacena la marca y modelo del auto;
    private String estado;

    public PolizaAuto(int numeroCuenta, String marcaYModelo, String estado){
        this.numeroCuenta = numeroCuenta;
        this.marcaYModelo = marcaYModelo;
        this.estado = estado;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getMarcaYModelo() {
        return marcaYModelo;
    }

    public void setMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean esEstadoSinCulpa(){
        boolean sinCulpa;
        switch (estado) {
            case "Ma":
            case "NJ":
            case "NY":
            case "PEN":
                sinCulpa = true;
                break;
            default:
             sinCulpa = false;
                break;
        }
        return sinCulpa;
    }
    

    
}

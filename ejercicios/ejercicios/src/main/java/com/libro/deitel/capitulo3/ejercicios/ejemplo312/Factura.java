package com.libro.deitel.capitulo3.ejercicios.ejemplo312;

public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    // creando constructor que inicialice las cuatro variables de instancia
    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // metodo obtener monto factura
    public double obtenerMontoFactura() {
        double monto;
        if (cantidad <= 0) {// si la cantidad es menor o igual a cero 

            cantidad = 0;
            monto = precio * cantidad;
            return monto;
            
        }else if (precio <= 0) {// si el precio es menor o igual a 0
            precio = 0.0;
            monto = precio * cantidad;
            return monto;

        }else{// y aqui pongo la parte normal del ejercicio

            monto = precio * cantidad;
            return monto;

        }
        
    }

}

package com.libro.deitel.capitulo6.enumeraciones;

public class Futbolista {
    
    private String nombre;
    private int dorsal;
    private Demarcacion demarcacion;
    private Equipo equipo;

    public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo){
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
        this.equipo = equipo;
    }
    
}

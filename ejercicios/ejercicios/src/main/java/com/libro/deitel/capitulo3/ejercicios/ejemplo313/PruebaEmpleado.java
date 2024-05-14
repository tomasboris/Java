package com.libro.deitel.capitulo3.ejercicios.ejemplo313;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado em1 = new Empleado("Tomas","Castro", 21000);
        Empleado em2 = new Empleado("Nicolas", "Gellona", 2000);
        System.out.println("Resumen ");
        System.out.println(em1.getNombre());
        System.out.println(em1.getApellido());
        System.out.println("Salario anual : " + em1.getSalario()*12);
        System.out.println(em2.getNombre());
        System.out.println(em2.getApellido());
        System.out.println("Salario anual : " + em1.getSalario()*12);
        System.out.println("Ahora un aumento del 10 % a cada uno ");
        System.out.println(em1.getNombre());
        System.out.println(em1.getApellido());
        System.out.println("Salario anual : " + ((em1.getSalario()*110)/100)*12);
        System.out.println(em2.getNombre());
        System.out.println(em2.getApellido());
        System.out.println("Salario anual : " + ((em2.getSalario()*110)/100)*12);

    }
}

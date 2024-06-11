package com.libro.deitel.capitulo6;

import java.security.SecureRandom;

public class EjercicioEnum {
    private static final SecureRandom sr = new SecureRandom();

    private int dado1, dado2;

    public int getDado1() {
        return dado1;
    }

    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    public int getDado2() {
        return dado2;
    }

    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }

    public int tirarDados() {
        dado1 = 1 + sr.nextInt(6);
        dado2 = 1 + sr.nextInt(6);
        int result = dado1 + dado2;
        return result;
    }

    public static void main(String[] args) {
        // Creando el objeto jugador basado en la clase anterior
        // Con esto ya puedo lanzar los dados ahora
        EjercicioEnum jugador = new EjercicioEnum();
        int tiroJugador = jugador.tirarDados();
        int contadorTiros = 0;
        System.out.println(tiroJugador);

        // Este es un switch es para el primer tiro
        switch (tiroJugador) {
            case 7:
            case 11:
                System.out.println("Jugador Gana");
                contadorTiros++;
                System.out.println("Con el primer tiro");
                break;
            case 2:
            case 3:
            case 12:
                System.out.println("Jugador pierde casa gana");
                contadorTiros++;
                System.out.println("Con el primer tiro");
                break;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                System.out.println("Punto del jugador");
                contadorTiros++;
                break;
            default:
                break;
        }
        // Esta parte es el segundo tiro si saca el mismo numero el jugador gana
        // Ahora si el jugador saca un 7 pierde
        if (tiroJugador == 4 || tiroJugador == 5 || tiroJugador == 6 || tiroJugador == 8 || tiroJugador == 9
                || tiroJugador == 10) {
            // Este es el segundo tiro del jugador donde si sale un 7 pierde, pero si no
            // sale 7 entra al ciclo repetitivo
            int segundoTiro = jugador.tirarDados();
            while (tiroJugador != 7) {
                int variosTiros = jugador.tirarDados();

                if (variosTiros == tiroJugador) {
                    System.out.println(" Saco otro " + variosTiros + " tiene dos puntos");
                    System.out.println("Jugador Gana, con una cantidad de lanzamientos =" + contadorTiros);
                    break;
                }
                if (variosTiros == 7) {
                    System.out.println("Jugador pierde saco un 7");
                    System.out.println("Cantidad de tiros = " + contadorTiros);
                    break;
                }

                contadorTiros++;

            }
            if (segundoTiro == 7) {

                System.out.println("Jugador pierde");
                System.out.println("Cantidad de tiros = " + contadorTiros);

            }

        }
    }

}

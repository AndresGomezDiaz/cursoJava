package org.agomez.hilos.ejemplos;

import org.agomez.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread( new ViajeTarea("Hawai")).start();

        new Thread( new ViajeTarea("Francia")).start();

        new Thread( new ViajeTarea("Japon")).start();

        new Thread( new ViajeTarea("Cancun")).start();
    }
}

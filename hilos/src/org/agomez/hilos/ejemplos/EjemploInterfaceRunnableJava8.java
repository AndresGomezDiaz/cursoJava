package org.agomez.hilos.ejemplos;

import org.agomez.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) {
        /*
        Runnable viaje = new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i < 5; i++) {
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long)(Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
            }
        };
         */
        // Convertimos en lambda
        Runnable viaje = () -> {
            for(int i = 1; i < 5; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long)(Math.random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
        };

        new Thread(viaje, "Hawai").start();
        new Thread(viaje, "Francia").start();
        new Thread(viaje, "Japon").start();
        new Thread(viaje, "Irlanda").start();
        new Thread(viaje, "Alemania").start();
    }
}

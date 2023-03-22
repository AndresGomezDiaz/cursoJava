package org.agomez.hilos.ejemplos;

import org.agomez.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
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
            System.out.println(main.getState());
        };

        Thread v1 = new Thread(viaje, "Hawai");
        Thread v2 = new Thread(viaje, "Francia");
        Thread v3 = new Thread(viaje, "Japon");
        Thread v4 = new Thread(viaje, "Irlanda");
        Thread v5 = new Thread(viaje, "Alemania");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();
        v5.join();
        // Con join, hacemos que el hilo principal espere a que se ejecute cada hilo


        // Esta es una pausa en el hilo principal (Main)
        // Thread.sleep(5000);

        System.out.println("Continuando con la ejecución del método Main");
    }
}

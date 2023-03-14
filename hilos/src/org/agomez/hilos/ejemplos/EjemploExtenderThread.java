package org.agomez.hilos.ejemplos;

import org.agomez.hilos.ejemplos.threads.NombreThread;
public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Jonh Doe");
        hilo.start();
        // Thread.sleep(100L);
        Thread hilo2 = new NombreThread("Juan Perez");
        hilo2.start();

        Thread hilo3  = new NombreThread("Andres");
        hilo3.start();

        System.out.println(hilo.getState());
    }
}

package org.agomez.hilos.ejemplossync;

import org.agomez.hilos.ejemplossync.runnable.Cliente;
import org.agomez.hilos.ejemplossync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class EjemploPanaderoClienteJ8 {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        /*
        * Este es el mismo ejemplo, pero usando
        * los conceptos de lambdas de Java 8
        * */
        new Thread( () -> {
            for(int i = 0; i < 10; i++) {
                p.hornear("Pan n " + i);
                try {
                    sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread( () -> {
            for(int i = 0; i < 10; i++) {
                p.consumir();
            }
        }).start();
    }
}

package org.agomez.hilos.ejemplossync.runnable;

import org.agomez.hilos.ejemplossync.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.*;

public class Panadero implements Runnable{
    private Panaderia panaderia;

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            panaderia.hornear("Pan n " + i);
            try {
                sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

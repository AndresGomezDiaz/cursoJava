package org.agomez.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaPeriodo {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        /*
        * Toolkit nos ayuda para emitir un beep
        * es una de sus funciones
        *
        * */
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        /*
        * Las variables Atómicas se pueden implementar
        * dentro de clases anónimas, a diferencia de las variables comunes
        *
        * */
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            //private int contador = 3;
            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                if(i > 0) {
                    toolkit.beep();
                    System.out.println("Tarea " + i + " periodica en " + new Date() + " nombre del Thread: "
                            + Thread.currentThread().getName());
                    //contador --;
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }

            }
        }, 5000, 10000);
        System.out.println("Agendamos una tarea para 5 segundos mas ...");
    }
}

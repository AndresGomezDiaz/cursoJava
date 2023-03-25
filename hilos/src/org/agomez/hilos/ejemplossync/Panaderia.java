package org.agomez.hilos.ejemplossync;

public class Panaderia {
    private String pan;
    private boolean disponible;
    /*
    * Solo se pueden usar los métodos
    * wait y notify para funciones
    * con sincronizadas (synchronized)
    * Syncronized: funciona para ejecutar procesos de manera
    * ordenada, por medio de wait, y notify, sirve para liberar un proceso
    * */
    public synchronized void hornear(String masa) {
        while(disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("El panadero está horneando el pan");
        this.disponible = true;
        notify();
    }

    public synchronized String consumir() {
        while(!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente consume el pan " + this.pan);
        this.disponible = false;
        notify();
        return pan;
    }


}

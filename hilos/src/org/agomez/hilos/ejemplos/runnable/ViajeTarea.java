package org.agomez.hilos.ejemplos.runnable;

public class ViajeTarea implements Runnable{
    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for(int i = 1; i < 5; i++) {
            System.out.println(i + " - " + nombre);
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finalmente me voy de viaje a " + nombre);

    }
}

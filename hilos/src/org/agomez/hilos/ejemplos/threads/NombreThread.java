package org.agomez.hilos.ejemplos.threads;

public class NombreThread extends Thread{
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia el mètodo run del hilo" + getName());
        for(int i = 0; i < 10; i++){
            System.out.println(this.getName() + " : " + i);
        }
        System.out.println("Se finaliza el hilo");
    }
}

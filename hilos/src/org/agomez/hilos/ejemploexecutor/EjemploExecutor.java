package org.agomez.hilos.ejemploexecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    /*
    * El framework Executor
    * nos ayuda al manejo de hilos utilizando pool de tareas
    * manejando los recursos de formas mas óptimas.
    *
    * */
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea ....");
            /*
            * La siguiente sentencia funciona igual que un Thread sleep
            * pero de forma mas optima
            * */
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                /*
                * Esto funciona para que en caso de un error, se detenga
                * el hilo actual y no se quede abierto
                * */
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea ...");
        };
        executor.submit(tarea);
        /*
        * Es necesario realizar un stop del hilo para que nuestra aplicación
        * termine, se pueden usar las siguientes formas:
        *
        * executor.shutdownNow();
        * Cierra de forma abruta el hilo corriendo el riesgo de dejar pendientes
        * tareas subsecuentes
        *
        * executor.shutdown();
        * Espera a que se ejecuten las tareas en ejecución y las encoladas antes de cerrar
        * por completo el hilo.
        * */
        executor.shutdown();
        /*
        * Tambien podemos usar:
        * executor.awaitTermination();
        * el cual nos sirve para darle el control al main despues de finalizar
        * la función Executor, es decir de que terminen todas las tareas
        * es decir deja en pausa las tareas del main hasta que termine las tareas del
        * executor para posteriormente pasar a las tareas restantes del main
        * */
        System.out.println("Continuando con la ejecución del método Main");
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Continuamos con la ejecución del método 2");

    }
}

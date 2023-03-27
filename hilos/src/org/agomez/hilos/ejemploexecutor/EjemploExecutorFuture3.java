package org.agomez.hilos.ejemploexecutor;

import org.agomez.hilos.ejemplossync.Panaderia;
import org.agomez.hilos.ejemplossync.runnable.Cliente;
import org.agomez.hilos.ejemplossync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorFuture3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        /*
         * Vamos a usar las tareas del ejemplo de panadería pero con el
         * framework de executor
         *
         * Debido a que son 2 tareas sincronizadas, el tamaño mínimo tiempre que ser de 2
         * de lo contrario como la tarea está en espera nunca pasará al consumo del cliente
         * 
         * */
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Panaderia p = new Panaderia();
        Runnable panadero = new Panadero(p);
        Runnable cliente = new Cliente(p);

        Future<?> resultado = executor.submit(panadero);
        Future<?> resultado2 = executor.submit(cliente);

        executor.shutdown();

    }
}

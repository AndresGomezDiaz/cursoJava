package org.agomez.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        /*
        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea ....");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea ...");
        };
         */
        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea ....");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea ...");
            return "Terminamos la tarea result";
        };
        //Future<?> resultado = executor.submit(tarea);

        //Con el callable como ya tenemos un retorno de variable lo declaramos dentro de los <>
        Future<String> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecución del método Main");
        System.out.println(resultado.isDone());
        // Al métido get le podemos poner valores para que solo se demore
        // X tiempo al ejecutar el hilo actual, de lo contrario lanzará una
        // Exepción
        while(!resultado.isDone()) {
            System.out.println("ejecutando tarea ...");
            TimeUnit.MILLISECONDS.sleep(1500);
            // 01 07 09 85 21
            // No. de Reporte Total Play: 27441803
        }
        //System.out.println("Resultado de la tarea: " + resultado.get(5, TimeUnit.SECONDS));
        System.out.println("Resultado de la tarea: " + resultado.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());
    }
}

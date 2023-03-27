package org.agomez.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        /*
         * Debido a que estamos usando un pool simple se ejecutan de forma lineal
         * */
        // ExecutorService executor = Executors.newSingleThreadExecutor();

        /*
        * Si lo cambiamos a FixedThreadPool podemos definir el número de pools que vamos a usar
        * Executors.newFixedThreadPool(3);
        * Si usamos CachedThreadPool() Los va generar bajo demanda, conforme se vallan necesitando
        * */
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea ....");
            try {
                System.out.println("Tarea 1: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {

                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea ...");
            return "Terminamos la tarea result";
        };

        Callable<Integer> tarea2 = () -> {
            System.out.println("Tarea 2: " + Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultado2 = executor.submit(tarea);
        Future<Integer> resultado3 = executor.submit(tarea2);

        executor.shutdown();

        System.out.println("Continuando con la ejecución del método Main");
        System.out.println(resultado.isDone());

        while(!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())) {
            System.out.println(String.format( "resultado1: %s - resultado2: %s - resultado3: %s",
                    resultado.isDone()? "finalizó": "en proceso",
                    resultado2.isDone()? "finalizó": "en proceso",
                    resultado3.isDone()? "finalizó": "en proceso"
                    ));
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println("Resultado de la tarea1: " + resultado.get());
        System.out.println("Resultado de la tarea2: " + resultado2.get());
        System.out.println("Resultado de la tarea3: " + resultado3.get());
        System.out.println("Finaliza la tarea: " + resultado.isDone());
    }
}

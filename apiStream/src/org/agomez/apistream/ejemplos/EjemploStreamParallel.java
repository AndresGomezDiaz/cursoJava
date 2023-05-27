package org.agomez.apistream.ejemplos;

import org.agomez.apistream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Andrés", "Manriquez"));
        lista.add(new Usuario("Jose", "Ezquivel"));
        lista.add(new Usuario("Miguel", "Roa"));
        lista.add(new Usuario("Marina", "Maruqez"));
        lista.add(new Usuario("Bruce", "Lee"));
        lista.add(new Usuario("Bruce", "Wilis"));

        /*
        * Al usar parallel estamos aplicando el uso de hilos
        * y asy el flatMap se ejecuta en varios hilos al mismo
        * tiempo para que la ejecución sea más rápida.
        * */

        long t1 = System.currentTimeMillis();
        String resultado = lista.stream()
                .parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(System.out::println)
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    if(nombre.contains("bruce".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");
        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total de ejecución: " + (t2 - t1));
        System.out.println(resultado);

    }
}

package org.agomez.apistream.ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploMap {

    public static void main(String[] args) {
        Stream.of("Pato", "Paco", "Miguel", "Arturo")
                .map(nombre -> {
                    return nombre.toUpperCase();
                }).forEach(x -> System.out.println(x));

        /*
        * Debido a que foreach es un metodo void
        * no podemos asignar el flujo a una variable
        * */
        System.out.println("############################");

        Stream<String> nombres = Stream.of("Pato", "Paco", "Miguel", "Arturo")
                .map(nombre -> {
                    return nombre.toUpperCase();
                });

        nombres.forEach(x -> System.out.println(x));

        // Ahora podemos agregar un flujo
        System.out.println("############################");
        // Peek se usa para revisar los elemntos dentro del Stream
        Stream<String> nombres1 = Stream
                .of("Pato", "Paco", "Miguel", "Arturo")
                .peek(e -> System.out.println("*"+ e))
                .map(nombre -> {
                    return nombre.toUpperCase();
                });
        System.out.println("*************");
        // Para ejecutar un stream, se tiene que hacer mediante un operado terminal (foreach)
        nombres1.forEach(x -> System.out.println(x));

        System.out.println("############################");
        // Se puede modificar varias veces el elemento
        Stream<String> nombres2 = Stream
                .of("Pato", "Paco", "Miguel", "Arturo")
                .peek(e -> System.out.println("*"+ e))
                .map(nombre -> {
                    return nombre.toUpperCase();
                })
                .peek(e -> System.out.println("+" + e))
                .map(nombre -> {
                    return nombre.toLowerCase();
                });
        System.out.println("*************");
        nombres2.forEach(x -> System.out.println(x));

        // Lo anteriror si lo hacemos usando el método de referencia quedaría:

        System.out.println("############################");
        // Se puede modificar varias veces el elemento
        Stream<String> nombres3 = Stream
                .of("Pato", "Paco", "Miguel", "Arturo")
                .map(String::toUpperCase)
                .map(String::toLowerCase);
        // Podemos ahora modificar el stream por una lista
        List<String> lista = nombres3.collect(Collectors.toList());
        lista.forEach(System.out::println);
    }
}

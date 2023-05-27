package org.agomez.apistream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamEmpty {
    public static void main(String[] args) {
        long count = Stream
                .of("Pato Hernandez", "Paco Guzman", "Miguel Rojas", "Arturo Fuentes",
                        "Pepe García", "Paco Rojas", "")
                .filter(n -> n.isEmpty())
                .peek(System.out::println)
                .count();
        // Esto puede ser String::isEmpty

        System.out.println("Número de registros vacíos : " + count);

        long contarRepetidos = Stream.of(1, 2, 3,3,4,5,5,6)
                .filter(n -> n == 3)
                .count();
        System.out.println("La cantidad de numeros 3 es: " + contarRepetidos);

    }

}

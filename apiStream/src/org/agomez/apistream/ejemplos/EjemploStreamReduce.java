package org.agomez.apistream.ejemplos;

import org.agomez.apistream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
        // El operador reduce también es terminal:

        Stream<String> nombres = Stream.of("Pato Hernandez", "Paco Guzman", "Miguel Rojas", "Arturo Fuentes",
                        "Pepe García", "Paco Rojas", "Pato Hernandez", "Pato Hernandez")
                .distinct();
        // Reduce nos ayuda a transformar un stream o lista en un string

        String resultado = nombres.reduce("Resultado del reduce: ", (a, b) -> a + ", "+ b);
        System.out.println(resultado);

        Stream<Integer> numeros = Stream.of(1,5,10,50,35);
        int resultadoSuma = numeros.reduce(0, (a,b) -> a+b);
        // se puede resumir en Integer::sum
        System.out.println("La suma de todos los numeros es: " + resultadoSuma);
    }

}

package org.agomez.apistream.ejemplos;

import org.agomez.apistream.ejemplos.models.Usuario;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream.of("Pato Hernandez", "Paco Guzman", "Miguel Rojas", "Arturo Fuentes",
                "Pepe García", "Paco Rojas", "Pato Hernandez", "Pato Hernandez")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length());
        // Podemos contar o "mezclar" elementos de IntStream con un objetos
        // solo que debemos usar un valor que se pueda hacer numerico
        // en este ejemplo usamos el largo de cada nombre
        // Se pordría usar el id o bien agregar un atributo de edad por ejemplo
        largoNombres.forEach(System.out::println);

    }
}

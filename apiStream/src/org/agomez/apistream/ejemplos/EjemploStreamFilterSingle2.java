package org.agomez.apistream.ejemplos;

import org.agomez.apistream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {
        Usuario usuario = Stream
                .of("Pato Hernandez", "Paco Guzman", "Miguel Rojas", "Arturo Fuentes",
                        "Pepe García", "Paco Rojas")
                .map(nombre-> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(20))
                .findFirst().orElseGet( () -> new Usuario("Jorge", "Campos"));
        /*
        * Si colocamos un peek antes del filter
        * lo que hace es ir recorriendo y se sale en cuanto
        * encuentra el registro solicitado por el filter
        * con esto se corrobora que findFirst es un operador terminal
        *
        * */
        System.out.println(usuario);
    }

}

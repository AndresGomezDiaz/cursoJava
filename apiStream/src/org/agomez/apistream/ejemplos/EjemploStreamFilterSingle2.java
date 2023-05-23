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
                .filter(u -> u.getId().equals(6))
                .findFirst().get();

        System.out.println(usuario);
    }

}

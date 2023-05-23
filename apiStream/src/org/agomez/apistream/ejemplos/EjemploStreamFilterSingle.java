package org.agomez.apistream.ejemplos;

import org.agomez.apistream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Pato Hernandez", "Paco Guzman", "Miguel Rojas", "Arturo Fuentes",
                        "Pepe García", "Paco Rojas")
                .map(nombre-> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Paco"))
                .peek(u -> System.out.println("Peek:" + u));


        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println(usuario.get());


    }

}

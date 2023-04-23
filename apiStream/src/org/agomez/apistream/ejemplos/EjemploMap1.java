package org.agomez.apistream.ejemplos;

import org.agomez.apistream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploMap1 {
    public static void main(String[] args) {

        Stream<Usuario> nombres3 = Stream
                .of("Pato Hernandez", "Paco Guzman", "Miguel Rojas", "Arturo Fuentes")
                .map(nombre-> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(u -> System.out.println(u))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    String apellidos = usuario.getApellidos().toUpperCase();
                    usuario.setNombre(nombre);
                    usuario.setApellidos(apellidos);
                    return usuario;
                });

        List<Usuario> lista = nombres3.collect(Collectors.toList());
        lista.forEach(u -> System.out.println(u));

    }
}

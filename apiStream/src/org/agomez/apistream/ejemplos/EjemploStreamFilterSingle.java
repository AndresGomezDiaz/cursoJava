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
                .filter(u -> u.getNombre().equals("Pacox"))
                .peek(u -> System.out.println("Peek:" + u));


        Optional<Usuario> usuario = nombres.findFirst();

        /*
        * Con la opción de orElse, se evita el nullPointerException
        * debido a que el filter no encuentre algo y se puede asignar un
        * valor por default y podemos usar orElseGet usando una expresión
        * lambda para especificar algo mas
        * */

        // System.out.println(usuario.orElse(new Usuario("Jorge", "Campos")));
        //System.out.println(usuario.orElseGet(() -> new Usuario("Jorge", "Campos")).getNombre());

        // isEmpty es solo de Java 11 en adelante

        if(usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        }else {
            System.out.println("No se encontró el elemento");
        }

    }

}

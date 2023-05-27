package org.agomez.apistream.ejemplos;

import org.agomez.apistream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Pato Hernandez", "Paco Guzman", "Miguel Rojas", "Arturo Fuentes",
                        "Pepe García", "Paco Rojas", "Pato Hernandez", "Pato Hernandez")
                .distinct();
        // Con distinct, podemos resolver solo los valores únicos
        nombres.forEach(System.out::println);

        System.out.println("#############################");

        // Ahora hacemos la prueba con la clase usuario
        Stream<Usuario> usuarios = Stream.of("Pato Hernandez", "Paco Guzman", "Miguel Rojas", "Arturo Fuentes",
                        "Pepe García", "Paco Rojas", "Pato Hernandez", "Pato Hernandez")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .distinct();
        /*
         * Si ingresamos el distinc antes del map, si nos va filtrar ya que aún no se crea el nuevo
         * objeto con map
         * Para solucionar esto hay que implementar en el modelo usuario el método Equals para que compare
         * tanto el nombre como el apellido y tengamos el mismo resultado con el distinc despues del map
         * */
        usuarios.forEach(System.out::println);
    }

}

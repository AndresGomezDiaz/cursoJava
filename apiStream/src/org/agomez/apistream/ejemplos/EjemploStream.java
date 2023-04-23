package org.agomez.apistream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        /*
        * Stream crea una nueva instancia, por lo que el elemento original
        * queda intacto.
        * */
        Stream<String> nombres = Stream.of("Pato", "Paco", "Miguel", "Arturo");

        // Métodos intermedios y finales

        nombres.forEach(e -> System.out.println(e));

        System.out.println("#############################");

        String[] arr = {"Pato", "Paco", "Miguel", "Arturo"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        System.out.println("#############################");

        Stream<String> nombres1 = Stream.<String>builder().add("Oscar")
                .add("Andres")
                .add("Genesis")
                .add("Rodo")
                .build();
        nombres1.forEach(System.out::println);

        System.out.println("#############################");

        List<String> lista = new ArrayList<>();
        lista.add("Betty");
        lista.add("Mariel");
        lista.add("Beto");
        lista.add("Juan");
        lista.add("Naty");

        Stream<String> nombres2 = lista.stream();
        //nombres2.forEach(System.out::println);
        lista.stream().forEach(System.out::println);
    }
}

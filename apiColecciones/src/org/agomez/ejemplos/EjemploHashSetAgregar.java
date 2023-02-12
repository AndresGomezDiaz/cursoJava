package org.agomez.ejemplos;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        /*
        * HashSet no permite elementos duplicados
        * no se pueden ordenar, para poderlo ordenar
        * habría que castearlo en un ArrayList
        *
        * */
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println(hs);

        hs.add("tres");

        System.out.println(hs);

    }
}

package org.agomez.ejemplos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSets {
    /*
    * Los TreeSets son colecciones que por defecto
    * son ordenadas, siempre almacenan la información
    * de forma ordenada, dependiendo la orden de ordenamiento
    * que se estipule
    *
    * Contemplemos que esto tiene un costo en rendimiento
    * con respecto a los HashSet
    *
    * Y a igual que los HashSet estas colecciones no permiten
    * datos duplicados
    *
    *
    * */
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("Los TreeSet Ordenan por defecto: \n" + ts);
        // Probemos con numeros:
        Set<Integer> tsNumeros = new TreeSet<>();
        tsNumeros.add(4);
        tsNumeros.add(2);
        tsNumeros.add(8);
        tsNumeros.add(1);
        tsNumeros.add(3);

        System.out.println("Un TreeSet de números ordenados: \n" + tsNumeros);

        // Para ordenar en forma descendente, usamos comparator
        Set<String> tsAsc = new TreeSet<>(Comparator.reverseOrder());

        /*
        * Podemos usar compareTo, con expresión lamda en lugar de reverseOrder
        * Esto para ordenar en una forma mas personalizada, en lugar
        * de solo a la inversa
        *
        Set<String> tsAsc = new TreeSet<>((a,b) -> {
            return b.compareTo(a);
        });
        * Podemos declararlo en una sola linea
        Set<String> tsAsc = new TreeSet<>((a,b) -> b.compareTo(a) });
        * */

        tsAsc.add("uno");
        tsAsc.add("dos");
        tsAsc.add("tres");
        tsAsc.add("cuatro");
        tsAsc.add("cinco");

        System.out.println("La lista reordenada quedó: \n" + tsAsc);

    }
}

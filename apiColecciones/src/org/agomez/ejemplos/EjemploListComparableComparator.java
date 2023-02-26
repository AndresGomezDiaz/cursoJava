package org.agomez.ejemplos;

import org.agomez.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    /*
    * Esto aplica a cualquier tipo de lista
    * ArrayList o List o LinkedList
    * */

    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Andres", 10));
        sa.add(new Alumno("Miguel", 9));
        sa.add(new Alumno("Zamanta", 8));
        sa.add(new Alumno("Zamanta", 8));
        sa.add(new Alumno("Juan", 9));
        sa.add(new Alumno("Betty", 7));
        sa.add(new Alumno("Betty", 7));
        sa.add(new Alumno("Saris", 8));
        sa.add(new Alumno("Ximena", 10));

        // Collections.sort(sa);
        /*
        * Si convertimos el valor int de la calificación de Alumno
        * por un Integer, podremos usar el compareTo
        * */
        //Collections.sort(sa, (a,b) -> b.getCalificacion().compareTo(a.getCalificacion()));

        // Podemos usar para las listas el método sort que es mas directo:
        // sa.sort((a,b) ->  b.getCalificacion().compareTo(a.getCalificacion()));

        // O usamos comparator
        // sa.sort(Comparator.comparing((Alumno a) -> a.getCalificacion()));

        // Si quisieramos que fuera descendente:
        // sa.sort(Comparator.comparing((Alumno a) -> a.getCalificacion()).reversed());

        // Lo anterior se puede resumir de la siguiente manera ya que es solo una linea
        sa.sort(Comparator.comparing(Alumno::getCalificacion).reversed());

        System.out.println(sa);
    }

}

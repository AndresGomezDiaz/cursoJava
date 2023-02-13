package org.agomez.set;

import org.agomez.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        /*
        * De inicio nos mandará error ya que una regla de TreeSet
        * es que los métodos que se implementen tienen que tener la interfaz
        * comparable
        * Ya sea que implementemos el compareTo o bien implementarlo directo
        *
        * */

        Set<Alumno> alumno = new TreeSet<>((a,b) -> a.getNombre().compareTo(b.getNombre()));

        alumno.add(new Alumno("Andres", 10));
        alumno.add(new Alumno("Oscar", 7));
        alumno.add(new Alumno("Miguel", 10));
        alumno.add(new Alumno("Manuel", 8));

        System.out.println(alumno);

    }
}

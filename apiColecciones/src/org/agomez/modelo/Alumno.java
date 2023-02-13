package org.agomez.modelo;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private int calificacion;

    /*
    * Debido a que int es una variable de tipo primitivo
    * no podemos ordenar por calificación, por lo tanto
    * hay que cambiarla a Integer siendo que esta clase
    * wraper si implementa compareTo
    * */

    public Alumno() {

    }

    public Alumno(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Alumno " + nombre + " y su calificación es: " + calificacion;
    }

    @Override
    public int compareTo(Alumno a) {
        /*
        * Si queremos comparar por nombre:
        if(this.nombre == null) {
            // Esto es para evitar un NullPointerException
            return 0;
        }
        return this.nombre.compareTo(a.nombre);

         */
        // Si queremos seguir manejando int, se tiene que hacer de la siguiente manera:

        if(this.calificacion == a.calificacion) {
            return 0;
        }
        if(this.calificacion > a.calificacion) {
            return 1;
        } else {
            return -1;
        }

        // De lo contrario usamos el mismo método que se usó en el nombre

    }
}

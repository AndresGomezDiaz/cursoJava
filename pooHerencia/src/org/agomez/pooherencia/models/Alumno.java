package org.agomez.pooherencia.models;

public class Alumno extends Persona {
    private String nombreColegio;
    private double calificacionMatematicas;
    private double calificacionHistoria;
    private double calificacionQuimica;

    public Alumno() {
        /*
        * Siempre que yo quiera invocar algún elemento de la clase padre, tiene que ser
        * declarado antes que cualquier otra declaración de la clase hija, se llama con la
        * función super();
        * */
    }

    public Alumno(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    public Alumno(String nombre, String apellidos, int edad, String nombreColegio) {
        super(nombre, apellidos, edad);
        this.nombreColegio = nombreColegio;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public double getCalificacionMatematicas() {
        return calificacionMatematicas;
    }

    public void setCalificacionMatematicas(double calificacionMatematicas) {
        this.calificacionMatematicas = calificacionMatematicas;
    }

    public double getCalificacionHistoria() {
        return calificacionHistoria;
    }

    public void setCalificacionHistoria(double calificacionHistoria) {
        this.calificacionHistoria = calificacionHistoria;
    }

    public double getCalificacionQuimica() {
        return calificacionQuimica;
    }

    public void setCalificacionQuimica(double calificacionQuimica) {
        this.calificacionQuimica = calificacionQuimica;
    }
    /*
    @Override
    public String Saludar() {
        return "Hola, soy alumno, mi nombre es: " + getNombre();
    }
     */

    @Override
    public String saludar() {
        return "Hola, soy alumno, mi nombre es: " + getNombre();
    }
}

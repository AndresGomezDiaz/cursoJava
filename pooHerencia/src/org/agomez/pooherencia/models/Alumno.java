package org.agomez.pooherencia.models;

public class Alumno extends Persona {
    private String nombreColegio;
    private double calificacionMatematicas;
    private double calificacionHistoria;
    private double calificacionQuimica;

    public Alumno() {

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
}

package org.agomez.pooherencia.models;

public final class AlumnoInternacional extends Alumno{
    /*
    * Al declarar la clase como final indica que no podrá ser heredada por otro
    * elemento hacia abajo.
    * De igual forma si alguna función interna se le instancía como final
    * no podrá tener sobrecarga ese método.
    * */

    private String pais;
    private double idiomas;

    public AlumnoInternacional() {

    }
    public AlumnoInternacional(String nombre, String apellidos, int edad, String nombreColegio, String pais) {
        super(nombre, apellidos, edad, nombreColegio);
        this.pais = pais;
    }
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(double idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + " y soy de " + pais;
    }
}

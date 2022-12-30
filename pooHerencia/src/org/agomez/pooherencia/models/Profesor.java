package org.agomez.pooherencia.models;

public class Profesor extends Persona {
    private String materia;

    public Profesor() {

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String saludar() {
        return "Hola, mi nombre es " + getNombre() + " y doy clase de " + getMateria();
    }
}

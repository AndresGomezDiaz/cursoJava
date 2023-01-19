package org.agomez.poointerfaces.imprenta.modelo;

public abstract class Hoja {
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    abstract public String imprimir();
}

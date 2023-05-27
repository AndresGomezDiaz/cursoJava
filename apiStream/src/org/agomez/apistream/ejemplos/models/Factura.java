package org.agomez.apistream.ejemplos.models;

public class Factura {
    private String descripcion;
    private Usuario ususario;
    public Factura(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsusario() {
        return ususario;
    }

    public void setUsusario(Usuario ususario) {
        this.ususario = ususario;
    }
}

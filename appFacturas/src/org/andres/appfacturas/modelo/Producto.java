package org.andres.appfacturas.modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private float costo;
    private static int ultimoCodigo;

    public Producto() {
        this.codigo = ++ultimoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getCosto() {
        return costo;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
}

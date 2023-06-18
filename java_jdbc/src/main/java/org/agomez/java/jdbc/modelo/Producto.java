package org.agomez.java.jdbc.modelo;

import java.util.Date;

public class Producto {
    private Long id;
    private String nombre;
    private Number precio;
    private Date fecha;

    public Producto() {

    }
    public Producto(Long id, String nombre, Number precio, Date fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Number getPrecio() {
        return precio;
    }

    public void setPrecio(Number precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return id + "|"
                + nombre + "|"
                + precio + "|"
                + fecha;
    }
}

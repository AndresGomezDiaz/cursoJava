package org.agomez.apistream.ejemplos.models;

import java.util.Objects;

public class Usuario {
    private String nombre;
    private String apellidos;
    private Integer id;
    private static int ultimoId;

    public Usuario(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return nombre + " " + apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(apellidos, usuario.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos);
    }
}

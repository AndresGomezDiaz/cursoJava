package org.agomez.java.jdbc.repositorio;

import org.agomez.java.jdbc.modelo.Producto;

import java.util.List;

public interface Repositorio<T> {
    List<T> listar();
    T porId(Long id);

    void guardar(Producto productro);

    void eliminar(Long id);
}

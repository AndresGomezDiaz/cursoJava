package com.agomez.optional.repositorio;

import com.agomez.optional.modelo.Computadora;

import java.util.Optional;

public interface Repositorio<T> {
    // Computadora filtrar (String nombre);
    /*
    * Vamos a crear un opcional para evitar el if del main,
    * */
    Optional<Computadora> filtrar (String nombre);

}

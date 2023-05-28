package com.agomez.optional;

import com.agomez.optional.modelo.Computadora;
import com.agomez.optional.repositorio.ComputadoraRepositorio;
import com.agomez.optional.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {
        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();

        Computadora pcDefault = new Computadora("HP Onen", "LA0001");

        Computadora pc = repositorio.filtrar("Mac").orElseThrow(() -> new IllegalStateException());

        System.out.println(pc);
        /*
        * orElseThrow sirve para retornar una excepción
        * es probable que en futuras actualizaciones de java ya no se pueda usar
        * la opción get() para estos casos, y sea necesario utilizar siempre orElseThrow
        * ya que es mejor tener una excepción controlada que una inesperada.
        * */

        String archivo = "documentopdf";

        String extension = Optional.ofNullable(archivo)
                .filter(ex -> ex.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);

    }
}

package com.agomez.optional;

import com.agomez.optional.modelo.Computadora;
import com.agomez.optional.repositorio.ComputadoraRepositorio;
import com.agomez.optional.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();
        Optional<Computadora> pc = repositorio.filtrar("asus");

        /*
        if(pc != null) {
            System.out.println(pc.getNombre());
        } else {
            System.out.println("No se ecnontró el registro");
        }
        */
        /*
        * Implementando el opcional
        if(pc.isPresent()){
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }
        */
        // Pero usando programación funcional quedaría:
        repositorio.filtrar("asus").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));
    }
}

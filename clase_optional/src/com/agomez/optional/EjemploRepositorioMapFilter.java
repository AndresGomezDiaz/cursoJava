package com.agomez.optional;

import com.agomez.optional.modelo.Computadora;
import com.agomez.optional.modelo.Fabricante;
import com.agomez.optional.repositorio.ComputadoraRepositorio;
import com.agomez.optional.repositorio.Repositorio;

import java.util.stream.Stream;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {
        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();
        /*
        Fabricante pc = repositorio.filtrar("rog")
                .map(c -> c.getProcesador())
                .map(p -> p.getFabricante())
                .orElseThrow();

        System.out.println(pc.getNombre());
        */
        String pc1 = repositorio.filtrar("Macbook")
                .flatMap(c -> c.getProcesador())
                .flatMap(p -> p.getFabricante())
                .map(f -> f.getNombre())
                .orElse("No existe");

        System.out.println(pc1);

        // Si usamos flatMap, podemos usar optional para que podamos usar


    }
}

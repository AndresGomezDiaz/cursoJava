package com.agomez.optional;

import com.agomez.optional.modelo.Computadora;
import com.agomez.optional.repositorio.ComputadoraRepositorio;
import com.agomez.optional.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {
        Repositorio<Computadora> repositorio = new ComputadoraRepositorio();

        Computadora pcDefault = new Computadora("HP Onen", "LA0001");

        Computadora pc = repositorio.filtrar("microsof").orElse(pcDefault);

        System.out.println(pc);

        /*
        pc = repositorio.filtrar("Mac").orElseGet(() -> {
            return pcDefault;
        });
        */

        pc = repositorio.filtrar("Maffc").orElseGet(() -> new Computadora("Microsoft", "Surface Pro 9"));

        System.out.println(pc);

        /*
        * El método orEleseGet es mas eficiente que orElse debido a que el primero solo invocará el
        * objeto por defecto cuando se utilice, mientras que orElse lo va invocar siempre, sin importar
        * si se utiliza o no.
        * */

    }
}

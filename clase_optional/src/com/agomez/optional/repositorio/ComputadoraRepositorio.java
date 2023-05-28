package com.agomez.optional.repositorio;

import com.agomez.optional.modelo.Computadora;
import com.agomez.optional.modelo.Fabricante;
import com.agomez.optional.modelo.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadoraRepositorio implements Repositorio<Computadora> {
    private List<Computadora> dataSource;
    public ComputadoraRepositorio(){
        dataSource = new ArrayList<>();
        Procesador prosc1 = new Procesador("I9", new Fabricante("Intel"));
        Computadora pc1 = new Computadora("Asus ROG", "Strix G512");
        pc1.setProcesador(prosc1);
        dataSource.add(pc1);
        Procesador prosc2 = new Procesador("M1", new Fabricante("Apple"));
        Computadora pc2 = new Computadora("MacBook Pro", "MVK2CI");
        pc2.setProcesador(prosc2);
        dataSource.add(pc2);
        dataSource.add(new Computadora("Surface", "Pro 9"));
    }

    @Override
    public Optional<Computadora> filtrar(String nombre) {
        /*for(Computadora pc: dataSource) {
            if(pc.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(pc);
            }
        }
        return Optional.empty();
         */
        // Recordemos que findFirst y FindAny devuelven un opcional
        // Si usamos contains, es como si usaramos un like de DB
        // y si usamos el equalsIgnoreCase es como si se usara una igualdad, pero ignorando mayusculas o minusculas
        /*
        return dataSource.stream()
                .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
         */
        // Si queremos que sea con un contains tendríamos que pasar ambos strings a mayusculas o minusculas
        // para que concuerde la busqueda:
        return dataSource.stream()
                .filter(c -> c.getNombre().toUpperCase().contains(nombre.toUpperCase()))
                .findFirst();

    }
}

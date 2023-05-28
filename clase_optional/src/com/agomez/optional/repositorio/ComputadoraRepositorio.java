package com.agomez.optional.repositorio;

import com.agomez.optional.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadoraRepositorio implements Repositorio<Computadora> {
    private List<Computadora> dataSource;
    public ComputadoraRepositorio(){
        dataSource = new ArrayList<>();
        dataSource.add(new Computadora("Asus ROG", "Strix G512"));
        dataSource.add(new Computadora("MacBook Pro", "MVK2CI"));
    }

    @Override
    public Optional<Computadora> filtrar(String nombre) {
        for(Computadora pc: dataSource) {
            if(pc.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(pc);
            }
        }
        return Optional.empty();
    }
}

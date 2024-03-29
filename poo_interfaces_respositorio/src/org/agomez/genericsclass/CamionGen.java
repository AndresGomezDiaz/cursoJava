package org.agomez.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CamionGen<T> implements Iterable<T>{
    private List<T> objetos;
    private int max;

    public CamionGen(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto) {
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No hay mas espacio");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}

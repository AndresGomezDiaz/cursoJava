package org.agomez.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

public class selectForm extends ElementoForm{

    private List<String> opciones;

    public selectForm (String nombre) {
        super(nombre);
        this.opciones = new ArrayList<String>();
    }

    public selectForm (String nombre, List<String> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    @Override
    public String dibujarHtml() {
        return null;
    }
}

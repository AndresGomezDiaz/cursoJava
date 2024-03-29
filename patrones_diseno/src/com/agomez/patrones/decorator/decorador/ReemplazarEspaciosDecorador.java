package com.agomez.patrones.decorator.decorador;

import com.agomez.patrones.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{
    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "-");
    }
}

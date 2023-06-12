package com.agomez.patrones.decorator.decorador;

import com.agomez.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;
    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}

package com.agomez.patrones.decorator2.decorador;

import com.agomez.patrones.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{
    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 10f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Leche";
    }
}

package com.agomez.patrones.factory;

import com.agomez.patrones.factory.producto.*;

public class PizzeriaCaliforniaFactory extends PizzzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
            case "hawaiana":
                producto = new PizzaCaliforniaHawaiana();
                break;
        }
        return producto;
    }
}

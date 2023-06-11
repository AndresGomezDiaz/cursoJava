package com.agomez.patrones.factory;

import com.agomez.patrones.factory.producto.PizzaNewYorkItaliana;
import com.agomez.patrones.factory.producto.PizzaNewYorkPeperoni;
import com.agomez.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzzeriaZonaAbstractFactory{

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "peperoni":
                producto = new PizzaNewYorkPeperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
        }
        /*
        * De Java 13 en adelante se puede usar un switch mejorado
        * que se vería de la siguiente manera:
        *
        * PizzaProducto producto = switch(tipo) {
        *   case "vegetariana" -> new PizzaNewYorkVegetariana();
        *   case "peperoni" -> new PizzaNewYorkPeperoni();
        *   case "italiana" -> new PizzaNewYorkItaliana();
        *   default -> null;
        * }
        *
        * */
        return producto;
    }
}

package com.agomez.patrones.factory.producto;

import com.agomez.patrones.factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni(){
        super();
        nombre = "Pizza de Peperoni New York";
        masa = "Masa delgada";
        salsa = "Salsa de tomate";
        ingredientes.add("Peperoni");
        ingredientes.add("Queso");

    }
    @Override
    public void cocinar() {
        System.out.println("NY - Cocinando por 40 min a 90°C");
    }
    @Override
    public void cortar() {
        System.out.println("NY - Cortando la pizza");
    }
}

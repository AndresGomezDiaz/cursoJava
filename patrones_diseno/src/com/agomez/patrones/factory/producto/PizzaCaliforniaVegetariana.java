package com.agomez.patrones.factory.producto;

import com.agomez.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza Vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Aceitunas");
        ingredientes.add("Cebolla morada");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cal - Cocinando por 25 min a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cal - Cortando la pizza en rebanadas");
    }
}

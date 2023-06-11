package com.agomez.patrones.factory.producto;

import com.agomez.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza Vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Pimiento");
        ingredientes.add("Aceitunas");
        ingredientes.add("Cebolla morada");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("NY - Cocinando por 25 min a 150°C");
    }
    @Override
    public void cortar() {
        System.out.println("NY - Cortando la pizza en rebanadas");
    }
}

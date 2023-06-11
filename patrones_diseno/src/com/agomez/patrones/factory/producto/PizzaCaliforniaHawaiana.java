package com.agomez.patrones.factory.producto;

import com.agomez.patrones.factory.PizzaProducto;

public class PizzaCaliforniaHawaiana extends PizzaProducto {

    public PizzaCaliforniaHawaiana(){
        super();
        nombre = "Pizza Hawaiana California";
        masa = "Masa de sarten";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Jamon");
        ingredientes.add("Piña");
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

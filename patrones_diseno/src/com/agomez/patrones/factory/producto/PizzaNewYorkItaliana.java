package com.agomez.patrones.factory.producto;

import com.agomez.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana(){
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa blanca";
        ingredientes.add("Queso mozzarelala");
        ingredientes.add("Queso de cabra");
        ingredientes.add("Jamon");
        ingredientes.add("Peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("NY - Cocinar por 40 min a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("NY - Cortar la pizza");
    }
}

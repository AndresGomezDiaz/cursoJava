package com.agomez.patrones.factory;

abstract public class PizzeriaZonaAbstracFactory {

    public PizzaProducto ordernarPizza(String tipoPizza){
        PizzaProducto pizza = crearPizza(tipoPizza);
        System.out.println("----- Fabricando la Pizza: " + pizza.getNombre() + " -----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract PizzaProducto crearPizza(String tipo);

}

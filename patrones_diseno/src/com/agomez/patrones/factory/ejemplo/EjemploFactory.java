package com.agomez.patrones.factory.ejemplo;

import com.agomez.patrones.factory.PizzaProducto;
import com.agomez.patrones.factory.PizzeriaCaliforniaFactory;
import com.agomez.patrones.factory.PizzeriaNewYorkFactory;
import com.agomez.patrones.factory.PizzeriaZonaAbstracFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaNewYorkFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaCaliforniaFactory cal = new PizzeriaCaliforniaFactory();
        /*
        * En el curso se indica que se debe crear el objeto con la clase mas abstracta
        * en este caso hacer un PizzeriaZonaAbstracFactory, pero manda error al hacerlo de esa
        * manera, hay que validar porque no lo permite, probablemente por la versión de java
        * */
        PizzaProducto pizza = cal.ordernarPizza("hawaiana");

        System.out.println("Bruce ordena la pizza: " + pizza.getNombre());

        pizza = ny.ordernarPizza("vegetariana");

        System.out.println("Andres ordena la pizza " + pizza.getNombre());


    }
}

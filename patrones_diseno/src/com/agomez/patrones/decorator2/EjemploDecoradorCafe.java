package com.agomez.patrones.decorator2;

import com.agomez.patrones.decorator2.decorador.ConChocolateDecorador;
import com.agomez.patrones.decorator2.decorador.ConCremaDecorador;
import com.agomez.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {
        Configurable cafe = new Cafe(7, "Cafe Moka");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del café moka es: " + conChocolate.getPrecioBase());
        System.out.println("Los ingredientes son: " + conChocolate.getIngredientes());

    }
}

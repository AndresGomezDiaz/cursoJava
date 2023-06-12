package com.agomez.patrones.observer.ejemplos;

import com.agomez.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 100);
        google.addObserver(observable -> {
            System.out.println("Jonh " + observable
                    );
        });
        google.addObserver(observable -> {
            System.out.println("Andres " + observable
            );
        });
        google.addObserver(observable -> {
            System.out.println("Maria " + observable
            );
        });
        google.modificaPrecio(2000);

    }
}

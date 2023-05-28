package com.agomez.optional;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Juan";
        Optional<String> opt = Optional.of(nombre);

        System.out.println("opt = " + opt);

        System.out.println(opt.isPresent());

        if(opt.isPresent()) {
            System.out.println("Hola " + opt.get());
        }
        else {
            System.out.println("No está presente");
        }
        System.out.println(opt.isEmpty()); // es la negación de isPresent

        opt.ifPresent( valor -> {
            System.out.println("Hola " + valor);
        });

        nombre = null;
        opt = Optional.ofNullable(nombre);
        System.out.println(opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());
        opt.ifPresent(valor -> System.out.println("Hola " + valor));
        //El método ifPresentOrElse solo está habilitado de java 9 en adelante

        opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor), () -> {
            System.out.println("No está presente");
        });

    }
}

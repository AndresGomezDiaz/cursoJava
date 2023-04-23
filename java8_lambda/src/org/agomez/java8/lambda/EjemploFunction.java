package org.agomez.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hola que tal " + param;
        String resultado = f1.apply("Jorge");

        System.out.println(resultado);

        Function<String, String> f2 = param -> param.toUpperCase();
        System.out.println(f2.apply("Manuel"));
        /*
        * Lo anteriror se puede simplificar de la siguiente manera:
        * */

        Function<String, String> f3 = String::toUpperCase;
        System.out.println(f3.apply("Enrique"));

        BiFunction<String, String, String> f4 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f4.apply("Andres", " Gomez");
        System.out.println(r2);

        BiFunction<String, String, Integer> f5 =(a, b) -> a.compareTo(b);
        System.out.println(f5.apply("andres", "andresin"));

        // Lo podemos hacer como referencia de método:

        BiFunction<String, String, Integer> f6 = String::compareTo;
        System.out.println(f6.apply("jorge", "andresin"));

    }

}

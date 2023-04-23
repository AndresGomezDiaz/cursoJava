package org.agomez.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    public double calcular(double a, double b, Aritmetica lambda) {
        return lambda.operacion(a, b);
    }

    public double calcular1(double a, double b, BiFunction<Double, Double, Double> lambda) {
        return lambda.apply(a, b);
    }

}

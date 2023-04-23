package org.agomez.java8.lambda;

import org.agomez.java8.lambda.aritmetica.Aritmetica;
import org.agomez.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFuncional {
    public static void main(String[] args) {

        Aritmetica suma = (a,b) -> a + b;
        Aritmetica resta = (a,b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println("La suma de 2 numeros: " + cal.calcular(10, 5, suma));
        System.out.println("La resta de 2 numeros: " + cal.calcular(10, 5, resta));
        System.out.println("La multiplicacin de 2 numeros: " + cal.calcular(10, 5, (a,b) -> a * b));
        System.out.println("La división de 2 numeros: " + cal.calcular1(10,5, (a,b) -> a/b));
    }

}

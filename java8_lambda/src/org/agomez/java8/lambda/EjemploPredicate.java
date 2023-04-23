package org.agomez.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        // Los predicate, siempre retornan un boleano

        Predicate<Integer> test = num -> num > 10;

        boolean r = test.test(7);
        System.out.println("r = " + r);

        Predicate<String> t2 = role -> role.equals("ADMINISTRATOR");
        System.out.println(t2.test("ADMINISTRATOR"));

        BiPredicate<String, String> t3 = (a,b) -> a.equals(b);
        System.out.println("Comparamos 2 strings: " + t3.test("andres", "andres"));

    }
}

package org.agomez.apistream.ejemplos;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {
        // Range nos va dar los valores mientras sea menor al segundo valor
        // es decir no toma en cuenta el segundo valor
        // Si queremos incluir el segundo argumento, podemos usar rangeClosed
        // y será como usar un mayor o igual
        // Se puede usar LongStream y DoubleStream
        IntStream numeros = IntStream.range(5, 20);

        int resultadoSuma = numeros.reduce(0, (a,b) -> a+b);
        // se puede resumir en Integer::sum
        System.out.println("La suma de todos los numeros es: " + resultadoSuma);

        //Lo anterior se puede resumir en:
        IntStream numeros1 = IntStream.range(5, 20);
        int resultadoSuma1 = numeros1.sum();
        System.out.println("El resultado de la suma metodo reducido es:" + resultadoSuma1 );

        //*** Una vez expuesto un stream, no se puede reutilizar

        IntStream numeros2 = IntStream.range(5, 20);
        IntSummaryStatistics stats = numeros2.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " + stats.getSum());
        System.out.println("promerdio: " + stats.getAverage());
        System.out.println("Conteo: " + stats.getCount());

        System.out.println("###################");
        System.out.println("Hacemos una prueba con un listado de numeros: ");
        IntStream testNum = IntStream.of(1,4,6,9,10,45,3,1);
        IntSummaryStatistics statusTest = testNum.summaryStatistics();
        System.out.println("max: " + statusTest.getMax());
        System.out.println("min: " + statusTest.getMin());
        System.out.println("sum: " + statusTest.getSum());
        System.out.println("promerdio: " + statusTest.getAverage());
        System.out.println("Conteo: " + statusTest.getCount());

    }

}

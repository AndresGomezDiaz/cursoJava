package org.agomez.generics;

import org.agomez.poointerfaces.modelo.Cliente;
import org.agomez.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenerics {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList();
        clientes.add(new Cliente("Andres", "Gómez"));

        // Estos son en caso de no especificar que es una lista de clientes
        // Cliente andres = (Cliente)clientes.get(0);
        // Cliente andres = (Cliente)clientes.iterator().next();

        Cliente andres = clientes.iterator().next();
        Cliente[] clientesArreglo = {
                new Cliente("Lucy", "Bravo"),
                new Cliente("Miguel","Hernandez")
        };

        Integer[] enterosArreglo = {1,2,3,4};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        System.out.println("Clientes Lista:");
        clientesLista.forEach(System.out::println);

        System.out.println("\nEnteros Lista:");
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(
                new String[]{"Juan", "Eder", "Maggi"},
                enterosArreglo);
        System.out.println("\nImprimimos el listado de nombres");
        nombres.forEach(System.out::println);

        System.out.println("\nImprimimos el listado de Bounds Generic");
        List<Integer> enterosBounds = fromArrayToListNumber(new Integer[]{1,2,3,4});
        enterosBounds.forEach(System.out::println);

        List<ClientePremium> clientePremiumList = fromArrayToList(
                new ClientePremium[]{
                        new ClientePremium("Jorge", "Mendez"),
                        new ClientePremium("Alonso", "Acosta")
                });
        imprimirCliente(clientes);
        imprimirCliente(clientesLista);
        imprimirCliente(clientePremiumList);

        System.out.println("Máximo de 1, 9 y 4 es: " + maximo(1, 9,4));
        System.out.println("Máximo de zanahora, manzana y uva: " + maximo("zanahoria", "manzana", "uva"));
    }
    /*
    * Convertimos con genericos un arreglo a listas
    * Los genericos por convención se usa T para listas
    * y se ponen entre <>
    * */
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Podemos implementar mas de un método en los generics
    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        System.out.println("Imprimimos dentro de la función: ");
        for(G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    /*
    * Creamos un Bound Generic, que es
    * un generico específico, en el siguiente caso solo
    * acepta numeros
    * */
    public static <T extends Number> List<T> fromArrayToListNumber(T[] c) {
        return Arrays.asList(c);
    }
    /*
    * Implementamos un método Wilcard Generic
    * Utilizamos comodines si queremos usar este generic
    * para hijos de una clase, en este caso poder imprimir ClientePremium
    * */
    public static void imprimirCliente(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }


}

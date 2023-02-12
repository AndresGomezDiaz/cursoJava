package org.agomez.ejemplos;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    /*
    * Este es un ejemplo para quitar los duplicados de un string
    * utilizando una colección HashSet
    * */
    public static void main(String[] args) {
        String[] peces = {"Bacalao", "Atun", "Robalo", "Sierra", "Bacalao", "Payaso"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for(String pez: peces) {
            if(!unicos.add(pez)) {
                System.out.println("El pez: " + pez + " está duplicado");
                /*
                * Recordando que una colección HashSet
                * no puede tener duplicados la usamos como herramienta
                * para validar el arreglo original
                * La validación de único la hace exacta
                * tomando en cuenta mayúsculas, minúsculas y acentos
                * */
                duplicados.add(pez);
            }
        }

        System.out.println(unicos.size() + " son lo únicos de la lista original de peces: \n" + unicos);

        System.out.println(duplicados.size() + " son los que están duplicados de peces: \n" + duplicados);

        /*
        *
        * Con removeAll podemos eliminar todos los elementos que estén en otra colección
        *
        * */
        unicos.removeAll(duplicados);
        System.out.println("Solo quedan como únicos: \n" + unicos);

    }
}

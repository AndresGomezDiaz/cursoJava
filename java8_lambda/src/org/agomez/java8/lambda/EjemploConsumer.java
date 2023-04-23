package org.agomez.java8.lambda;

import org.agomez.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        /*
        * Una expresión lambda es una interfaz funcional
        * */

        // Si la función solo es de una línea, se pueden omitir las llaves
        // Por defecto el consummer solo acepta un parámetro y no retorna nada

        Consumer<String> consumidor = System.out::println;

        Consumer<Date> consumidor2 = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(f.format(fecha));
        };

        consumidor.accept("Saludando a todos");
        consumidor2.accept(new Date());

        // Con Biconsumer se pueden enviar 2 parámetros en un consumer
        BiConsumer<String, Integer> consumidor3 = (nombre, edad) -> {
            System.out.println(nombre + " tiene " + edad + " años");
        };
        consumidor3.accept("Pepe", 45);

        //Normalmente las expresiones lambda se utilizan en el API stream de java.
        List<String> nombre = Arrays.asList("Andrés", "Juan", "Oscar", "Betty");
        nombre.forEach(consumidor);

        /*
        * En el ejemplo anterior vemos como usar un consumidor sobre el api de List
        * de java para imprimir los nombres.
        * */

        Usuario usuario = new Usuario();

        BiConsumer<Usuario, String> asignaNombre = (persona, nombreUsuario) -> {
            persona.setNombre(nombreUsuario);
        };
        asignaNombre.accept(usuario, "Miguel");
        System.out.println("#############");
        System.out.println("Nombre del usuario: " + usuario.getNombre());

        System.out.println("*********************");

        Supplier<String> proveedor = () -> {
            return "Hola mundo";
        };
        System.out.println(proveedor.get());
    }
}
package org.agomez.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Jorge");
        persona.put("apellido", "Martinez");
        persona.put("email", "jmartinez@correo.com");
        persona.put("telefono", "321654987");

        System.out.println(persona);

        String nombre = persona.get("nombre");
        System.out.println(nombre);

        System.out.println("****** Con un foreach tradicional ******");
        // Para iterar usando un for:
        for(String llave: persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println("****** Con una expresión lamda ******");
        // Y podemos iterar con una expresión lamda
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });


    }
}

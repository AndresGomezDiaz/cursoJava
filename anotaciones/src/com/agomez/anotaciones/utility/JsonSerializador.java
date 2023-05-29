package com.agomez.anotaciones.utility;

import com.agomez.anotaciones.Init;
import com.agomez.anotaciones.JsonAtributo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializador {

    public static void inicializarObjeto(Object object) {
        if(Objects.isNull(object)){
            throw new RuntimeException("El objeto es nulo");
        }
        Method[] metodos = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch(InvocationTargetException | IllegalAccessException e) {
                        e.printStackTrace();
                    }

                });
    }
    public static String convertirJson(Object object) {

        if(Objects.isNull(object)){
            throw new RuntimeException("El objeto es nulo");
        }
        inicializarObjeto(object);
        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class))
                .map(f-> {
                    f.setAccessible(true); // Esto es porque la variable es privada, y se requiere para dar acceso
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()
                            :  f.getAnnotation(JsonAtributo.class).nombre();
                    try {
                        Object valor = f.get(object);
                        if(f.getAnnotation(JsonAtributo.class).capitalizar()
                                && valor instanceof String) {
                            String nuevoValor = (String)valor;
                            // Transformamos la primera letra en mayuscula
                            /*nuevoValor = nuevoValor.substring(0,1).toUpperCase() +
                                    nuevoValor.substring(1).toLowerCase();*/
                            //nuevoValor = String.valueOf(nuevoValor.charAt(0)).toUpperCase();

                            // Si queremos que cada palabra inicie con mayuscula:

                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                    .map(palabra -> palabra.substring(0,1).toUpperCase()
                                                    + palabra.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));

                            f.set(object, nuevoValor);
                        }
                        return "\"" + nombre + "\": \"" + f.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Error al serializar a Json: " + e.getMessage());
                    }
                })
                .reduce("{", (a,b) -> {
                    if("{".equals(a)){
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }
}

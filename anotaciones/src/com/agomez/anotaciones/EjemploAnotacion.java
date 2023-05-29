package com.agomez.anotaciones;

import com.agomez.anotaciones.modelo.Producto;
import com.agomez.anotaciones.utility.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa de centro de ROBLE");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));


    }
}

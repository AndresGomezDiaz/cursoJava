package org.agomez.java.jdbc;

import org.agomez.java.jdbc.modelo.Producto;
import org.agomez.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.agomez.java.jdbc.repositorio.Repositorio;
import org.agomez.java.jdbc.util.ConexionDB;

import java.sql.*;

public class EjemploJdbMejorado {
    public static void main(String[] args) {
        // ESTA ES UNA IMPLEMENTACIÓN PARA CERRAR LA CONEXIÓN EN CADA MOVIMIENTO
        System.out.println("########## Listado general ##########");
        Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
        repositorio.listar().forEach(System.out::println);
        System.out.println("########## Buscar por Id ##########");
        Long idBusqueda = 3L;
        if (repositorio.porId(idBusqueda) == null) {
            System.out.println("No existe el registro buscado");
        } else{
            System.out.println(repositorio.porId(3L));
        }
        /*
        Debido a que en la implementación del repositorio
        se está cerrando la conexión ya no es necesario el try/catch
        */
    }
}

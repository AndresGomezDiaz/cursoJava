package org.agomez.java.jdbc;

import org.agomez.java.jdbc.modelo.Producto;
import org.agomez.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.agomez.java.jdbc.repositorio.Repositorio;
import org.agomez.java.jdbc.util.ConexionDB;

import java.sql.*;

public class EjemploJdbMejorado {
    public static void main(String[] args) {
        try(Connection conn = ConexionDB.getInstance()
        ){
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
            System.out.println("########## Creamos un producto ##########");
            Producto p = new Producto();
            p.setNombre("TECLADO");
            p.setPrecio(150.0);
            repositorio.guardar(p);
            repositorio.listar().forEach(System.out::println);


        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}

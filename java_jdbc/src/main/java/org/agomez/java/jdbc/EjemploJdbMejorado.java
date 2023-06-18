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
            System.out.println(repositorio.porId(2L));

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}

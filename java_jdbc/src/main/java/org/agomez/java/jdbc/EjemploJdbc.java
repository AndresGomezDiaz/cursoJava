package org.agomez.java.jdbc;

import java.sql.*;

public class EjemploJdbc {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/java_curso?serverTimezone=UTC";
        String username = "postgres";
        String pass = "mysql";
        try {
            Connection conn = DriverManager.getConnection(url, username, pass);
            Statement stmt = conn.createStatement();

            ResultSet resultado = stmt.executeQuery("SELET * FROM productos");
            /*
            * Crear una base de datos con una tabla llamada productos
            *
            * */
            while(resultado.next()){
                System.out.println(resultado.getString("nombre"));
            }
            resultado.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

package org.agomez.java.jdbc;

import java.sql.*;

public class EjemploJdbc {
    /*
     * Crear una base de datos con una tabla llamada:
     * producto [id, nombre, precio, fecha_creacion]
     *
     * */
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/java_curso?serverTimezone=UTC";
        String username = "postgres";
        String pass = "mysql";

        try(Connection conn = DriverManager.getConnection(url, username, pass);
            Statement smt = conn.createStatement();
            ResultSet resultado = smt.executeQuery("SELECT * FROM producto")
        ){
            while(resultado.next()){
                StringBuilder sb = new StringBuilder();
                sb.append(resultado.getInt("id"))
                    .append("|")
                    .append(resultado.getString("nombre"))
                    .append("|")
                    .append(resultado.getInt("precio"))
                    .append("|")
                    .append(resultado.getString("fecha_registro"));
                System.out.println(sb.toString());

            }
        } catch(SQLException e) {
            e.printStackTrace();
        }


        // Para evitar tener que hacer mucho codigo para cerrar las conexiones
        // podemos realizar el autoclose utilizando el try con recursos
        /*
        try {
            conn = DriverManager.getConnection(url, username, pass);
            stmt = conn.createStatement();
            resultado = stmt.executeQuery("SELECT * FROM producto");
            while(resultado.next()){
                System.out.println(resultado.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
                resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        */

    }
}

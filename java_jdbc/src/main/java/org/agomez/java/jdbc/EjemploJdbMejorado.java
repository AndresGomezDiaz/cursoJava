package org.agomez.java.jdbc;

import org.agomez.java.jdbc.util.ConexionDB;

import java.sql.*;

public class EjemploJdbMejorado {
    public static void main(String[] args) {
        try(Connection conn = ConexionDB.getInstance();
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
                System.out.println(sb);

            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}

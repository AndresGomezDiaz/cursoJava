package org.agomez.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static String url = "jdbc:postgresql://localhost:5432/java_curso?serverTimezone=UTC";
    private static String username = "postgres";
    private static String pass = "mysql";
    private static Connection conn;
    // Aquí estamos usando un método Singleton (una sola conexión por contexto)
    // Para eliminar el Singleton, solo se quita la reutilización de la conexión
    public static Connection getInstance() throws SQLException {
        /*
        if(conn == null){
            conn = DriverManager.getConnection(url, username, pass);
        }
         */
        return DriverManager.getConnection(url, username, pass);
    }
}

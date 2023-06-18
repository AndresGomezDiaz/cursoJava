package org.agomez.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static String url = "jdbc:postgresql://localhost:5432/java_curso?serverTimezone=UTC";
    private static String username = "postgres";
    private static String pass = "mysql";
    private static Connection conn;

    public static Connection getInstance() throws SQLException {
        if(conn == null){
            conn = DriverManager.getConnection(url, username, pass);
        }
        return conn;
    }
}

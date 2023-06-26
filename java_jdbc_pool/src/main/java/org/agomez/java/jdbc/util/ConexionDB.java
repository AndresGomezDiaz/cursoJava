package org.agomez.java.jdbc.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static String url = "jdbc:postgresql://localhost:5432/java_curso?serverTimezone=UTC";
    private static String username = "postgres";
    private static String pass = "mysql";

    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if(pool == null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(username);
            pool.setPassword(pass);
            // Por defecto es 0 y los máximos son 8
            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }

}

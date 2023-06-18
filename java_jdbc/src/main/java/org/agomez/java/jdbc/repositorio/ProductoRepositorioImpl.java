package org.agomez.java.jdbc.repositorio;

import org.agomez.java.jdbc.modelo.Producto;
import org.agomez.java.jdbc.util.ConexionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio{
    private Connection getConnection() throws SQLException {
        return ConexionDB.getInstance();
    }
    @Override
    public List listar() {
        List<Producto> productos = new ArrayList<>();
        try(Statement smtmp = getConnection().createStatement();
            ResultSet rs = smtmp.executeQuery("SELECT * FROM producto;")
        ){
            while(rs.next()) {
                Producto p = crearProducto(rs);
                productos.add(p);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }
    @Override
    public Object porId(Long id) {
        Producto producto = null;
        String query = "SELECT * FROM producto WHERE id = ?;";
        try(PreparedStatement psmtp = getConnection().prepareStatement(query)){
            psmtp.setLong(1, id);
            ResultSet rs = psmtp.executeQuery();
            if(rs.next()) {
                producto = crearProducto(rs);
            }
            rs.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Object o) {

    }

    @Override
    public void eliminar(Long id) {

    }
    private static Producto crearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId((long) rs.getInt("id"));
        p.setNombre(rs.getString("nombre"));
        p.setPrecio(rs.getDouble("precio"));
        p.setFecha(rs.getDate("fecha_registro"));
        return p;
    }
}

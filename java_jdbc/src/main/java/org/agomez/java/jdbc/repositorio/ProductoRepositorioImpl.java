package org.agomez.java.jdbc.repositorio;

import org.agomez.java.jdbc.modelo.Categoria;
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
        String query = "SELECT a.id, a.nombre AS producto, a.precio, a.fecha_registro," +
                                "a.categoria_id, b.nombre AS categoria" +
                        " FROM producto a INNER JOIN categoria b ON a.categoria_id = b.id;";
        System.out.println(query);
        try(Statement smtmp = getConnection().createStatement();
            ResultSet rs = smtmp.executeQuery(query)
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
        String query = "SELECT a.id, a.nombre AS producto, a.precio, a.fecha_registro," +
                "a.categoria_id, b.nombre AS categoria" +
                " FROM producto a INNER JOIN categoria b ON a.categoria_id = b.id" +
                " WHERE a.id = ?";
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
    public void guardar(Producto producto) {
        String query = "";
        if(producto.getId() != null && producto.getId() > 0){
            query = "UPDATE producto SET nombre = ?, precio = ?, categoria_id = ? WHERE id = ?;";
        } else {
            query = "INSERT INTO producto (nombre, precio, categoria_id, fecha_registro) " +
                    "VALUES(?, ?, ?, NOW())";
        }
        try(PreparedStatement psmtp = getConnection().prepareStatement(query)){
            psmtp.setString(1, producto.getNombre());
            psmtp.setDouble(2, producto.getPrecio());
            psmtp.setDouble(3, producto.getCategoria().getId());
            if(producto.getId() != null && producto.getId() > 0){
                psmtp.setLong(4, producto.getId());
            }
            /*
            * Si tuvieramos que mandar la fecha de registro tendríamos que pasarlo de la siguiente manera:
            * tenemos que convertir un java util en un java sql
            * psmtp.setDate(3, new Date(producto.getFecha().getTime()));
            * Convermitmos la fecha en milisegundos
            * */
            // Cuando se tiene un insert o un update se recomienda usar executeUpdate
            psmtp.executeUpdate();

        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void eliminar(Long id) {
        String query = "DELETE FROM producto WHERE id = ?;";
        try(PreparedStatement stmt = getConnection().prepareStatement(query)){
            stmt.setLong(1, id);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    private static Producto crearProducto(ResultSet rs) throws SQLException {
        Producto p = new Producto();
        p.setId((long) rs.getInt("id"));
        p.setNombre(rs.getString("producto"));
        p.setPrecio(rs.getDouble("precio"));
        p.setFecha(rs.getDate("fecha_registro"));
        Categoria c = new Categoria();
        c.setId(rs.getLong("categoria_id"));
        c.setNombre(rs.getString("categoria"));
        p.setCategoria(c);
        return p;
    }
}

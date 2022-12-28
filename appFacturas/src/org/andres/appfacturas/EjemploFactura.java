package org.andres.appfacturas;

import org.andres.appfacturas.modelo.Cliente;
import org.andres.appfacturas.modelo.Factura;
import org.andres.appfacturas.modelo.ItemFactura;
import org.andres.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setTax("GODA8411165L3");
        cliente.setNombre("Andrés Gómez");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripción de la factura: ");
        String desc = s.nextLine();
        Factura factura = new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;
        System.out.println();

        for (int i = 0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto n " + producto.getCodigo() + ": ");
            nombre = s.nextLine();
            producto.setNombre(nombre);
            System.out.print("Ingrese el precio: ");
            precio = s.nextFloat();
            producto.setCosto(precio);
            System.out.print("Ingrese la cantidad de este producto: ");
            cantidad = s.nextInt();
            ItemFactura item = new ItemFactura(cantidad, producto);

            factura.addItemFactura(item);
            System.out.println();
            s.nextLine();
        }
        System.out.println(factura.generaDetalle());
    }
}

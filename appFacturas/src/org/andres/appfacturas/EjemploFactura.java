package org.andres.appfacturas;

import org.andres.appfacturas.modelo.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setTax("GODA8411165L3");
        cliente.setNombre("Andrés Gómez");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese cuantos productos va capturar: ");
        int numProductos = s.nextInt();
        Factura dataFactura = new Factura();

        if(numProductos > dataFactura.MAX_ITEMS_X_PROD) {
            System.out.println("No puedes capturar mas de " + dataFactura.MAX_ITEMS_X_PROD + "productos.");
            System.exit(0);
        }
        s.nextLine();
        System.out.println("Ingrese una descripción de la factura: ");
        //String desc = s.nextLine();
        Factura factura = new Factura(s.nextLine(), cliente);


        Producto producto;
        //String nombre;
        //float precio;
        //int cantidad;
        System.out.println();

        for (int i = 0; i < numProductos; i++){
            producto = new Producto();
            System.out.print("Ingrese el producto n " + producto.getCodigo() + ": ");
            //nombre = s.nextLine();
            producto.setNombre(s.nextLine());
            System.out.print("Ingrese el precio: ");
            //precio = s.nextFloat();
            producto.setCosto(s.nextFloat());
            System.out.print("Ingrese la cantidad de este producto: ");
            //cantidad = s.nextInt();
            //ItemFactura item = new ItemFactura(s.nextInt(), producto);

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));
            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}

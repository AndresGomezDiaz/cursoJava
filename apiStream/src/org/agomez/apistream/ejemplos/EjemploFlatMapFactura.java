package org.agomez.apistream.ejemplos;

import org.agomez.apistream.ejemplos.models.Factura;
import org.agomez.apistream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploFlatMapFactura {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Jonh", "Doe");
        Usuario u2 = new Usuario("Jorge", "Ramirez");

        u1.addFactura(new Factura("Computadora"));
        u1.addFactura(new Factura("Escritorio"));
        u1.addFactura(new Factura("Silla"));

        u2.addFactura(new Factura("IPad"));
        u2.addFactura(new Factura("Funda Ipad"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        // Usando el método clásico:
        /*
        for (Usuario u: usuarios) {
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }
        */
        //Usando el apiStream
        usuarios.stream().flatMap(u ->u.getFacturas().stream())
                .filter(u -> u.getUsusario().getNombre().equals("Jonh"))
                .forEach(f -> System.out.println("Factura de: "
                            + f.getUsusario().getNombre()
                            + " con el concepto: " + f.getDescripcion()));

    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class DetalleDeFactura {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
         /*
          La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
          Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
          Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
          Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
          Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
          Por ejemplo, el resultado podría ser algo así:
          La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
        * */
        float impuestos = 19;
        System.out.println("Vamos a llenar la informacion de tu factura:");
        System.out.println("Cual es el nombre o descripcion de tu factura:");
        Scanner scanner = new Scanner(System.in);
        String descripcionFactura = scanner.nextLine();
        System.out.println("Ahora vamos a capturar los precios de tu factura:");
        System.out.println("Precio 1:");
        Double precio1 = 0.0;
        try {
            precio1 = scanner.nextDouble();
        } catch(Exception err) {
            System.out.println("El valor del precio1 tiene que ser un número");
            main(args);
            System.exit(0);
        }
        System.out.println("Precio 2:");
        Double precio2 = 0.0;
        try {
            precio2 = scanner.nextDouble();
        } catch(Exception err) {
            System.out.println("El valor del precio2 tiene que ser un número");
            main(args);
            System.exit(0);
        }
        var totalSinImpuestos = (precio1 + precio2);
        String mensaje = "La factura con nombre: " + descripcionFactura +
                            "\nTiene un total de: " + totalSinImpuestos +
                            "\nCon un impuesto de: " + df.format(totalSinImpuestos * (impuestos/100)) +
                            "\nEl total con impuestos es: " + df.format((totalSinImpuestos * (impuestos/100))+totalSinImpuestos);
        System.out.println(mensaje);
    }
}

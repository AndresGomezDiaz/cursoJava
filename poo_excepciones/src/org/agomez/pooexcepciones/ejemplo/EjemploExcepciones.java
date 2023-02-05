package org.agomez.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        //String valor = JOptionPane.showInputDialog("Ingrese un numero entero: ");
        //int divisor;
        // double division;

        String numerador = JOptionPane.showInputDialog("Ingrese el numerador: ");
        String divisor = JOptionPane.showInputDialog("Ingrese el divisor: ");

        Calculadora calc = new Calculadora();

        try {
            // divisor = Integer.parseInt(valor);
            // int division = 10 / divisor;
            // division = calc.dividir(10, divisor);
            // System.out.println("El valor de dividir " + divisor + " entre 10 es: " + division);

            double division2 = calc.dividir(numerador, divisor);
            System.out.println("El valor de dividir " + divisor + " entre " + numerador + " es: " + division2);
        }
        catch(FormatoNumeroException ne) {
            System.out.println(ne.getMessage());
            // El printStackTrace sirve para imprimir en la consola el mensaje de error
            // Como si hubiera tronado, pero continua
            ne.printStackTrace(System.out);
            main(args);
        }
        catch (DivisionPorZeroException ae) {
            System.out.println(ae.getMessage());
            ae.printStackTrace(System.out);
            main(args);
        }
        finally {
            System.out.println("Realizamos esta operación sin imporar lo que pase dentro del try/catch");
        }
        System.out.println("Continuamos con nuestro flujo");

    }
}

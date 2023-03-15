package org.agomez.ejemplos;

public class Pruebas {
    public static void main(String[] args) {
        String strNumero = "288";
        if (strNumero.trim().matches("[0-9]*")) {
            System.out.println("Es un numero");
        } else {
            System.out.println("no es un numero");
        }
    }
}

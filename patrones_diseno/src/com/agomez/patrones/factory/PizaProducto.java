package com.agomez.patrones.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizaProducto {
    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregamos la salsa " + salsa);
        this.ingredientes.forEach(System.out::println);
    }

    abstract public void cocinar();
    abstract public void cortar();

    public void empaquetar() {
        System.out.println(" Poniendo la pizza en su caja de cartón");
    }

    @Override
    public String toString() {
        return "PizaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}

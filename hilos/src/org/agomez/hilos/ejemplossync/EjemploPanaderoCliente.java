package org.agomez.hilos.ejemplossync;

import org.agomez.hilos.ejemplossync.runnable.Cliente;
import org.agomez.hilos.ejemplossync.runnable.Panadero;

public class EjemploPanaderoCliente {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Cliente(p)).start();
    }
}

package com.agomez.patrones.singleton;

public class EjemploSingleton {
    // El Patron Singleton es un patron CREACIONAL
    public static void main(String[] args) {
        // Validamos que la instancia solo se crea una vez,

        for(int i = 0; i<=10; i++){
            ConexionBdSingleton con = ConexionBdSingleton.getInstancia();
            System.out.println("con = " + con);
        }
    }
}

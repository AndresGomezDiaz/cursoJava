package com.agomez.patrones.singleton;

public class ConexionBdSingleton {
    // La idea de un singleton es restringir el constructor
    // para que solo se pueda usar una vez

    private static ConexionBdSingleton instancia;

    private ConexionBdSingleton(){
        System.out.println("Conectandose a la base de datos");
    }
    public static ConexionBdSingleton getInstancia() {
        if(instancia == null) {
            instancia = new ConexionBdSingleton();
        }
        /*if(!(instancia instanceof ConexionBdSingleton)){
            instancia = new ConexionBdSingleton();
        }*/
        return instancia;
    }

}

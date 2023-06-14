package com.agomez.archivos.ejemplo;

import com.agomez.archivos.ejemplo.service.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\archivosTest\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
        // service.crearArchivo2(nombreArchivo);
        String texto = service.leerArchivo1(nombreArchivo);
        System.out.println(texto);
    }
}

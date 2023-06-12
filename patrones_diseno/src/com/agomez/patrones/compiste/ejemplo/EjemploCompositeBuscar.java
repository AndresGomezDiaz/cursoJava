package com.agomez.patrones.compiste.ejemplo;

import com.agomez.patrones.compiste.Archivo;
import com.agomez.patrones.compiste.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");
        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);
        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpg"));

        //System.out.println(doc.mostrar(0));
        boolean encontrado = doc.buscar("patroncomposite.docx");
        System.out.println("Encotrado: " + encontrado);

        encontrado = doc.buscar("Java");
        System.out.println("Encontrado: " + encontrado);
    }
}

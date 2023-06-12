package com.agomez.archivos.ejemplo.service;

import java.io.*;

public class ArchivoServicio {
    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);

        try {
            // El segundo parametro, lo que hace es que si existe el archivo
            // Va añadir texto al archivo existente
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            /*
            * BufferedWriter es mas efectivo que el FileWriter ya que almacena
            * la información en memoria y cada cierto tamaño libera para llenar el archivo
            * mientras que FileWriter hace un llamado al archivo cada que se ejecuta un append
            * */


            buffer.append("\nHola mundo en un archivo!")
                    .append("\nTodo bien?, aqui imprimiendo un archivo")
                    .append("\nHasta luego!");
            buffer.close();
            System.out.println("El archivo se creó con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void crearArchivo1(String nombre) {
        File archivo = new File(nombre);
        // Podemos hacerlo de manera mas optima:
        // Con esto podemos omitir el close ya que si algo sale mal al leer y/o abrir
        // el archivo entra a la excepción y el try cierra de forma implicita el archivo
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))){
            buffer.append("\nHola mundo en un archivo 1!")
                    .append("\nTodo bien?, aqui imprimiendo un archivo")
                    .append("\nHasta luego!");
            System.out.println("El archivo se creó con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        // PrintWriter nos permite utilizar funciones para los saltos de linea
        // y es mas completo que el BufferedWriter
        // PEro es igual de optimo que BufferedWriter ya que lo trabaja por debajo
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){
            buffer.println("Hola mundo en un archivo 2!");
            buffer.println("Todo bien?, aqui imprimiendo un archivo");
            buffer.println("Hasta luego!");

            System.out.println("El archivo se creó con éxito");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

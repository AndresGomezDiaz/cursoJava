package org.agomez.poointerfaces.imprenta;

import org.agomez.poointerfaces.imprenta.modelo.*;
import static org.agomez.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {

    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Andrés Gómez",
                "Ingeniero en Sistemas", "Este es el contenido del CV");
        cv.addExperiencias("JavaScript Sr.")
                .addExperiencias("Oracle DBA")
                .addExperiencias("PHP Jr.")
                .addExperiencias("Angular Jr.");

        Informe informe = new Informe("James Rodriguez", "Martin Fowler",
                "Estudio de microservicios");

        Libro libro1 = new Libro("Carl Sagan", "Yo Robot", FICCION);
        libro1.addPagina(new Pagina("Yo soy un robot"))
                .addPagina(new Pagina("Yo soy un robot 2"))
                .addPagina(new Pagina("Yo soy un robot 3"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro1);

    }

    public static void imprimir (Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}

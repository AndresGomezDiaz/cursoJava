package org.agomez.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: " + this.titulo)
                .append("\nAutor: " + this.autor)
                .append("\nGenero: " + this.genero)
                .append("\n");

        int numPag = 1;
        for(Imprimible pag : paginas) {
            sb.append("Pagina: " + numPag + ": " + pag.imprimir() + "\n");
            numPag++;
        }
        return sb.toString();
    }

}

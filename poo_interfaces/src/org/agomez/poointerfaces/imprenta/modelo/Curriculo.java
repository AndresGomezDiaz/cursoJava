package org.agomez.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencias(String experiencia) {
        this.experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(persona)
                .append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencia: \n");
        /*
        for(String exp: this.experiencias) {
            sb.append("- ").append(exp).append("\n");
        }
        */

        experiencias.forEach(exp -> {
            sb.append("- ").append(exp).append("\n");
        });
        return sb.toString();
    }

    @Override
    public String imprimirColor() {
        StringBuilder sb = new StringBuilder();
        sb.append(persona)
                .append("\n")
                .append("Resumen en Color: ").append(this.contenido)
                .append("\n").append("Profesion Color: ")
                .append(this.carrera).append("\n")
                .append("Experiencia Color: \n");
        /*
        for(String exp: this.experiencias) {
            sb.append("- ").append(exp).append("\n");
        }
        */

        experiencias.forEach(exp -> {
            sb.append("- ").append(exp).append("\n");
        });
        return sb.toString();
    }
}

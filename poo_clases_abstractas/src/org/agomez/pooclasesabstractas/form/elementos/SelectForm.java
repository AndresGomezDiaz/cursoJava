package org.agomez.pooclasesabstractas.form.elementos;

import org.agomez.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }
    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }
    /*
    * En este caso indicamos que retorne la misma clase para que el método
    * pueda ser encadenado o bien es una función recursiva,
    * así cada que se agregue una opción al select, no es necesario invocar cada objeto
    * para insertar cada opción
    * se puede hacer addOpcion().addOpcion()...
    * */
    public SelectForm addOpcion(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }
    public List<Opcion> getOpciones() {
        return opciones;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name = '")
                .append(this.nombre)
                .append("'>");
        for(Opcion opcion : this.opciones) {
            sb.append("\n\t<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if(opcion.isSelected()) {
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");

        }
        sb.append("\n</select>");
        return sb.toString();
    }
}

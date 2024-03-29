package org.agomez.pooclasesabstractas.form.elementos;

import org.agomez.pooclasesabstractas.form.validador.LargoValidador;
import org.agomez.pooclasesabstractas.form.validador.Validador;
import org.agomez.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;
    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }
    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }
    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }
    public List<String> getErrores() {
        return errores;
    }

    public boolean esValido() {
        for(Validador v: this.validadores) {
            if(!v.esValido(this.valor)) {
                if(v instanceof MensajeFormateable) {
                    this.errores.add(((LargoValidador) v).getMensajeFormateado(nombre));
                }
                else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }

            }
        }
        return this.errores.isEmpty();
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    // Solo pueden existir metodos abstractos dentro de una clase abstracta
    // Los métodos abstractos solo se declaran, la implementación
    // viene en las clases hijas
    public abstract String dibujarHtml();


}

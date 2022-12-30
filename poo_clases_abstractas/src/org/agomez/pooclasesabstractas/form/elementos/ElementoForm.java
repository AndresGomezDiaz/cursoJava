package org.agomez.pooclasesabstractas.form.elementos;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    public ElementoForm() {

    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // Solo pueden existir metodos abstractos dentro de una clase abstracta
    // Los métodos abstractos solo se declaran, la implementación
    // viene en las clases hijas
    public abstract String dibujarHtml();

}

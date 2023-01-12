package org.agomez.pooclasesabstractas.form.validador;

abstract public class Validador {

    protected String mensaje;
    public abstract void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValido(String valor);

}

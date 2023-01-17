package org.agomez.pooclasesabstractas.form.validador;

abstract public class Validador {

    protected String mensaje;
    public abstract void setMensaje(String mensaje);
    public abstract String getMensaje();
    public abstract boolean esValido(String valor);

}

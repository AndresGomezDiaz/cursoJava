package org.agomez.pooclasesabstractas.form.validador;

public class NoNulo extends Validador{
    /*
    * Para que sea mas estructurado el nombre del campo lo vamos a pasar
    * por plantilla/patron/wilcard
    * */
    protected String mensaje = "El campo %s no puede ser nulo";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }
}

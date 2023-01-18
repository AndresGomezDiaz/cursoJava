package org.agomez.pooclasesabstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "El atributo del campo %s debe ser número";

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
        try {
            Integer.parseInt(valor);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }
}

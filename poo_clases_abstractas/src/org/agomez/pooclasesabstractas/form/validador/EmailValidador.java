package org.agomez.pooclasesabstractas.form.validador;

public class EmailValidador  extends Validador{
    protected String mensaje = "Formato del email es inválido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

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
        /*
        * Con matches podemos validar un String
        * con su regex
        * */
        return valor.matches(EMAIL_REGEX);
    }
}

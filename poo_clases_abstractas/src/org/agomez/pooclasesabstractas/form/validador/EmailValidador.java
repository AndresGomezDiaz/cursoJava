package org.agomez.pooclasesabstractas.form.validador;

public class EmailValidador  extends Validador{
    protected String mensaje = "Formato de email inválido";
    private final static String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";

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

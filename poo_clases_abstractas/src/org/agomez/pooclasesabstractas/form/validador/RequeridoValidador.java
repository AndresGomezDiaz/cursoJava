package org.agomez.pooclasesabstractas.form.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "El campo es requerido";

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
        return (valor != null && valor.length() > 0);
        /*
        * Podemos usar de igual forma isEmpty()
        * o bien isBlank()
        * La diferencia entre empty y blank es que blank
        * nos va a validar si se ingresó un espacio vacío
        * y empty nos dirá solo si tiene caracteres
        * */
    }
}

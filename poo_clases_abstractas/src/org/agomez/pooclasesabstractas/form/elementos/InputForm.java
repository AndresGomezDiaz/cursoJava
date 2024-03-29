package org.agomez.pooclasesabstractas.form.elementos;

public class InputForm extends ElementoForm {
    private String tipo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*
    * Cuando se maneja herencia de una clase abstracta
    * es necesario implementar los metodos de la clase
    * padre abstracta
    * */
    @Override
    public String dibujarHtml() {
        return "<input type= '" + this.tipo +
                    "' name= '" + this.nombre +
                    "' value = '" + this.valor +"'>";
    }
}

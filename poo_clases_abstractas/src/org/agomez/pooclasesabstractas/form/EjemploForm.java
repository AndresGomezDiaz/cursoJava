package org.agomez.pooclasesabstractas.form;

import org.agomez.pooclasesabstractas.form.elementos.ElementoForm;
import org.agomez.pooclasesabstractas.form.elementos.InputForm;
import org.agomez.pooclasesabstractas.form.elementos.SelectForm;
import org.agomez.pooclasesabstractas.form.elementos.TextAreaForm;
import org.agomez.pooclasesabstractas.form.elementos.select.Opcion;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        /*
        * Las clases abstractas se implementan al momento de usarse
        * desde otras clases, no se pueden reutilizar
        *
        ElementoForm el = new ElementoForm() {

            @Override
            public String dibujarHtml() {
                return null;
            }
        };
        */

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("password", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextAreaForm experiencia = new TextAreaForm("experiencia", 5 , 9);
        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion lang1 = new Opcion("1", "Java");
        Opcion lang2 = new Opcion("2", "Javascript");

        /*
        * Esto es una implementación de clase anónima
        * estas clases se pueden instanciar una vez, pero solo se pueden usar
        * dentro del scope donde se declara.
        * Y extienden de una clase padre
        * */
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name= '" + this.nombre + "' value=\""+ this.valor + "\">";
            }
        };
        saludar.setValor("Hola, que tal esta es la información de las clases: ");

        lenguaje.addOpcion(lang1)
                .addOpcion(lang2.setSelected())
                .addOpcion(new Opcion("3", "PHP"))
                .addOpcion(new Opcion("4","Javascript"));

        username.setValor("jonh.doe");
        password.setValor("12345");
        email.setValor("jonh.doe@correo.com");
        edad.setValor("35");
        // lang1.setSelected(true);
        experiencia.setValor("Mas de 10 años de experiencia programando sistemas");

        List<ElementoForm> elementos = Arrays.asList(username, password,
                            email, edad, experiencia, lenguaje, saludar);
        /*
        En lugagar de usar un array list podemos usar Arrays.asList
        y esa función internamente crea un ArrayList con los elementos
        que tiene en su declaración

        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        * */

        // A partir de java 8 podemos usar sintaxis de Lamdas

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml() + "<br />");
        });

        /*
        for(ElementoForm e : elementos) {
            System.out.println(e.dibujarHtml() + "< /br>");
        }
         */
    }
}

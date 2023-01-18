package org.agomez.pooclasesabstractas.form;

import org.agomez.pooclasesabstractas.form.elementos.ElementoForm;
import org.agomez.pooclasesabstractas.form.elementos.InputForm;
import org.agomez.pooclasesabstractas.form.elementos.SelectForm;
import org.agomez.pooclasesabstractas.form.elementos.TextAreaForm;
import org.agomez.pooclasesabstractas.form.elementos.select.Opcion;
import org.agomez.pooclasesabstractas.form.validador.*;

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
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("password", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new RequeridoValidador())
                .addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("experiencia", 5 , 9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNulo());

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
        password.setValor("12uaE3RTm9");
        email.setValor("andres@recaudia.com");
        edad.setValor("32");
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

        elementos.forEach(elForm -> {
            System.out.println(elForm.dibujarHtml() + "<br />");
            if(!elForm.esValido()) {
                // En expresiones Lamda si solo tiene una linea se pueden omitir las llaves
                // e.getErrores().forEach(err -> System.out.println("Tenemos error: " + err));
                // Podemos usar el siguiente argumento se puede resumir usando un atajo
                // Solo aplica cuando se asume que solo un argumento se pasa dentro del método
                // por eso se declara con :: Metodo de referencia o referenciado
                // e.getErrores().forEach(System.out::println);
                elForm.getErrores().forEach(err -> System.out.println("Tenemos error en el campo " + elForm.getNombre() + ": " + err));
            }
        });
    }
}

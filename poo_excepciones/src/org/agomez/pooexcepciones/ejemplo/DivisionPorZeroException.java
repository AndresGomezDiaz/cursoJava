package org.agomez.pooexcepciones.ejemplo;

public class DivisionPorZeroException extends Exception{
    /*
    * Si heredamos de exception es checked
    * Si heredamos de RuntimeException es unchecked
    * La diferencia es que con Exception estamos obligados a propagar
    * la excepción hacia los métodos donde se usa.
    * */
    public DivisionPorZeroException(String mensaje) {
        super(mensaje);
    }

}

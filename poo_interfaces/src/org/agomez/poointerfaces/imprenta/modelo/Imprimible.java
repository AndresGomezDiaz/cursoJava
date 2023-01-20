package org.agomez.poointerfaces.imprenta.modelo;

public interface Imprimible {
    /*
    * En las interfaces para evitar que un método sea obligatorio
    * de implementar, como sucede con la estructura base de una interfaz
    * se puede declarar como default e implementarse, de esa manera, cuando se
    * importa la interfaz en otra clase no es obligatorio que se implemente
    * las funciones que son default
    *
    * Explicado de otro modo al tener una implementación no es necesario implementarla
    * en otras clases ya que tiene una implementación por defecto
    *
    * Y solo se aplica cuando el método que queremos implementar es opcional
    *
    * Esto no se recomienda ya que la naturaleza de las interfaces es que
    * sean métodos obligatorios de implementar
    * */
    String imprimir();

    // Podemos declararlo como estático para que el llamado sea por clase
    default String imprimirColor() {
        return "Imprimiendo un valor por defecto en color";
    }

    static String imprimirBN(Imprimible imprimible) {
        return imprimible.toString();
    }
}

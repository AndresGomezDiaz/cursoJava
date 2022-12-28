public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    NARANJA("Naranja"),
    VERDE("Verde"),
    GRIS("Gris Oscuro");

    private final String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    /*
    * Podemos implementar el valor de toString
    * para que por defecto sin agregar el valor de getColor
    * nos imprima el color con su valor asignado por el set
    * ya que por defecto lo convierte a String al imprimirlo en consola
    * */
    @Override
    public String toString() {
        return this.color;
    }
}

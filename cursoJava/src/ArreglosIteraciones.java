public class ArreglosIteraciones {
    public static void main(String[] args) {
        String[] productos = {"Memoria USB", "Telefono celular",
                "Disco Duro", "Laptop", "Mackbook Air",
                "Chrome Cast", "Bicicleta"};
        int total = productos.length;

        System.out.println("*** Iterando con For ***");
        /*
        Par el ciclo for es mas eficiente ingresar el total de registros
        en una variable ya que en cada iteración estaría comprobando el total
        de registros
         */
        for(int i = 0; i < total; i++){
            System.out.println("El registro " + i + " es: " + productos[i]);
        }
        System.out.println("*** Iterando con ForEach ***");
        // Podemos igual utilizar un foreach
        for(String producto : productos) {
            System.out.println("El registro es: " + producto);
        }
        // Se puede utilizar while y do-while, pero los mas usados son for y foreach

    }
}

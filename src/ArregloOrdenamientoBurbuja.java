public class ArregloOrdenamientoBurbuja {

    public static void main(String[] args) {
        String[] productos = {"Memoria USB", "Telefono celular",
                "Disco Duro", "Laptop", "Mackbook Air",
                "Chrome Cast", "Bicicleta"};
        int total = productos.length;
        int contador = 0;
        /*
            La función de strings compareTo nos ayuda a comparar 2 strings
            lo hace revisando su valor unicode, si el valor es menor a cero
            es que su orden es primero, si es mayor a cero es que su orden es
            posterior y si es igual a cero es que los 2 elementos son iguales.
         */

        /*
        for(int i = 0; i < total; i++) {
            for(int j = 0; j < total; j++) {
                if(productos[i].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }

        Esto no es tan eficiente ya que tiene muchas iteraciones el proceso
        esto da 49 iteraciones
         */
        // Lo podemos optimizar de la siguiente manera:

        for(int i = 0; i < total - 1; i++) {
            for(int j = 0; j < total - 1 - i; j++) {
                // Restamos total-1 para evitar el desborde del arreglo en j+1
                if(productos[j + 1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j + 1];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("Numero de iteraciones: " + contador);
        System.out.println("Validamos el reordenamiento");
        for(int i = 0; i < total; i++){
            System.out.println("El registro " + i + " es: " + productos[i]);
        }

    }
}

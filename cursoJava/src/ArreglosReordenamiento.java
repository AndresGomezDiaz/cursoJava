import java.util.Arrays;

public class ArreglosReordenamiento {
    // Generamos una función para reordenar a la inversa
    public static void reordenaArreglo (String[] arreglo) {
        int total = arreglo.length;
        int total2 = arreglo.length;
        for(int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Memoria USB", "Telefono celular",
                "Zapatos deportivos","Disco Duro",
                "Laptop", "Mackbook Air",
                "Chrome Cast", "Bicicleta"};
        int total = productos.length;

        // Podemos ordernarlo en forma alfabetica:
        Arrays.sort(productos);
        // En este caso no es necesario asignar el valor de nuevo
        System.out.println("Arreglo Reordenado");
        for(int i = 0; i < total; i++){
            System.out.println("El registro " + i + " es: " + productos[i]);
        }
        // Reordenamos a la inversa:
        reordenaArreglo(productos);
        /*
        * Podemos usar el API de colecciones de Java
        * para hacer un ordenamiento inverso
        * */
        // Collections.reverse(Arrays.asList(productos));

        System.out.println("Arreglo Reordenado a la inversa");
        for(int i = 0; i < total; i++){
            System.out.println("El registro " + i + " es: " + productos[i]);
        }

    }
}

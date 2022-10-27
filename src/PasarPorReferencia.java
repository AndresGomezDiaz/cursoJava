public class PasarPorReferencia {
    public static void main(String[] args) {
        // Vamos a usar arreglos ya que trabajan por
        // referencias o punteros
        int[] edad = {10,11,12};

        System.out.println("Iniciamos el main");
        for (int k : edad) {
            System.out.println("La edad[i] = " + k);
        }
        System.out.println("Antes de invocar al metodo test");
        test(edad);
        System.out.println("Despues de invocar al metodo test");

        for (int j : edad) {
            System.out.println("La edad[i] = " + j);
        }
        System.out.println("Finaliza el metodo main");
        // Al ser un metodo mutable al pasar por referencia
        // Sí se modifica el valor
    }

    public static void test(int[] edadArreglo) {
        System.out.println("Iniciamos el metodo test");
        for(int i = 0; i < edadArreglo.length; i++) {
            edadArreglo[i] = edadArreglo[i] + 20;
        }
        System.out.println("Finalizamos el metodo test");
    }
}

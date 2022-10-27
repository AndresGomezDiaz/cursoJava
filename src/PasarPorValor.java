public class PasarPorValor {
    public static void main(String[] args) {
        // Esto es un valor primitivo
        // Los valores primitivos solo pueden declararse con valor
        int i = 10;
        System.out.println("Iniciamos el main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i = " + i);
        // Con los valores primitivos se pasa el valor y no el objeto como tal
        // por eso no cambia el valor
        // Las clases wrapper son inmutables
    }

    public static void test(int i) {
        System.out.println("Iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("El nuevo valor de i = " + i);
    }
}

public class EjemploArreglos {
    public static void main(String[] args) {
        /*
        * Este tipo de arreglos no pueden ser dinamicos
        * en el sentido que no podrá tener mas de 4 registros
        * este tipo de arreglos solo admiten el tipo de dato al que refiere
        * en este caso int
        * */
        int[] numerosEnteros = new int[4];

        numerosEnteros[0] = 1;
        numerosEnteros[1] = 2;
        numerosEnteros[2] = 3;
        numerosEnteros[3] = 4;

        int a = numerosEnteros[0];
        int b = numerosEnteros[1];
        int c = numerosEnteros[2];
        int d = numerosEnteros[3];
        // Por defecto los valores serían cero
        System.out.println("El valor 0: " + a);
        System.out.println("El valor 1: " + b);
        System.out.println("El valor 2: " + c);
        System.out.println("El valor 3: " + d);


    }
}

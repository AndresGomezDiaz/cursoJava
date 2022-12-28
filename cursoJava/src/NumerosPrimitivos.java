public class NumerosPrimitivos {
    public static void main(String[] args){

        /*
         * El valor por defecto de las variables primitivas es 0
         * y para float y double es 0.0
         * */

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("El tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("El tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("El valor maximo de un byte es: " + Byte.MAX_VALUE);
        System.out.println("El valor manimo de un byte es: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("El tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("El valor maximo de un short es: " + Short.MAX_VALUE);
        System.out.println("El valor manimo de un short es: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El tipo integer corresponde en byte a: " + Integer.BYTES);
        System.out.println("El tipo integer corresponde en bites a: " + Integer.SIZE);
        System.out.println("El valor maximo de un integer es: " + Integer.MAX_VALUE);
        System.out.println("El valor manimo de un integer es: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        // Para los numeros long es necesario incluir una letra L al final del numero para diferenciar
        // Entre un Integer y un Long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("El tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("El valor maximo de un long es: " + Long.MAX_VALUE);
        System.out.println("El valor manimo de un long es: " + Long.MIN_VALUE);

        /*
        * A partir de Java 11, al usar:
        *   var miNumero = 12478
        * Sin importar el numero que ingresemos por defecto
        * se convierte en integer
        * Si se llegase a manejar un valor mayor al limete de integer
        * hay que manejarlo con L F o D para que en automático con la
        * capacidad de la variable requerida.
        * */

        // Hasta este punto se manejan solo numeros enteros,
        // Para tipos decimales se usan los siguientes:

        float numeroFloat = 2.12e3F;
        /*
        * El valor 2.12e3 es lo mismo que 2110F
        * solo que para ahorrar memoria podemos usar la notación científica
        * que equivale a
        * 2 multiplicado por 10 elevado a la 3
        * Ejemplos:
        * 1.5e4F = 150000F => Consola daría 15000.0
        * Para el caso de números negativos:
        * 1.5e-10F = 0.00000000015
        * El valor "eNUMERO" es Matiza, asi se le conoce
        * */
        // Para los numeros long es necesario incluir una letra F al final del numero
        // Este es de presición simple
        /*
         * Un numero flotante es una representación cientifica de un numero real
         * para poder almacenar numeros mayores en un espacio pequeño de memoria
         * Si usamos un numero con decimales de tipo float es necesario ponerle
         * la F al final para indicar que es de tipo flotante no así con los double.
         */
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("El tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("El tipo float corresponde en bites a: " + Float.SIZE);
        System.out.println("El valor maximo de un float es: " + Float.MAX_VALUE);
        System.out.println("El valor manimo de un float es: " + Float.MIN_VALUE);

        double numeroDouble = 3.4028235E38;
        // Para valores double ya no es necesario asignar una letra al final del numero
        // Si usamos a partir de java 11 var con un decimal por defecto lo usa como double
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("El tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("El tipo double corresponde en bites a: " + Double.SIZE);
        System.out.println("El valor maximo de un double es: " + Double.MAX_VALUE);
        System.out.println("El valor manimo de un double es: " + Double.MIN_VALUE);

    }
}

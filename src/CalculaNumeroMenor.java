import java.util.ArrayList;
import java.util.Scanner;

public class CalculaNumeroMenor {
    /*
    * Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10
    * valores enteros, usando la clase Scanner ingresar la cantidad de números a comparar,
    * luego utilizando una sentencia for iterar el numero de veces (ingresado) para pedir
    * el numero entero, entonces se requiere:
    *       + Calcular el menor número e imprimir el valor.
    *       + Si el menor número es menor que 10, imprimir
    *       "El número menor es menor que 10!". si no, imprimir "
    *       el numero menor es igual o mayor que 10!".
    * */
    public static void main(String[] args) {
        System.out.println("Tarea no. 7: Calcular el numero menor de multiples valores");
        Scanner scanner = new Scanner(System.in);
        int numeroRegistros = 0;
        ArrayList<Integer> numerosValidar = new ArrayList<>();


        System.out.println("Ingresa el número de registros que vas a revisar:");
        try {
            numeroRegistros = scanner.nextInt();
        } catch(Exception err) {
            System.out.println("Solo puede ingresar números, intentelo nuevamente");
            main(args);
            System.exit(0);
        }
        // Validamos que se puedan validar mínimo 10 dígitos
        if(numeroRegistros < 10) {
            System.out.println("No puede evaluar menos de 10 números");
            main(args);
            System.exit(0);
        }
        if(numeroRegistros > 20) {
            System.out.println("No puede evaluar mas de 20 numeros");
            main(args);
            System.exit(0);
        }
        int numeroMenor = 0;
        // Obtenemos los numeros a validar
        for(int i = 0; i <= numeroRegistros; i++){
            System.out.println("Ingresa el numero " + i+1 + " a comparar: ");
            numerosValidar.add(scanner.nextInt());
            if(i == 0) {
                numeroMenor = numerosValidar.get(0);
            }
            if(numerosValidar.get(i) < numeroMenor){
                numeroMenor = numerosValidar.get(i);
            }
        }

        System.out.println("Los valores elegidos fueron: ");
        System.out.println(numerosValidar);
        System.out.println("El numero menor es: " + numeroMenor);
        if(numeroMenor < 10) {
            System.out.println("El numero menor es menor que 10!");
        } else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }

    }
}

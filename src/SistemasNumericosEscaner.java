import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEscaner {
    public static void main(String[] args) {
        // Aquí se va hacer lo mismo, pero tomando los datos de la terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            // numeroDecimal = Integer.parseInt(numeroStr);
            numeroDecimal = scanner.nextInt();
        } catch(Exception e) {
            // Podemos usar Excpetion en lugar de la excepcion específica
            // ya que es la mas general
            System.out.println("ERROR! : Debe ingresar un número entero");
            main(args);
            System.exit(0);
        }
        String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNUmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);
    }
}

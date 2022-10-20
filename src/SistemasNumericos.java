import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        // int numeroDecimal = 500;
        String numeroStr = JOptionPane.showInputDialog("Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero");
            main(args);
            // una vez que enviamos el mensaje, enviamos al main para que se ejecute de nuevo
            System.exit(0);
            // Pero mandamos System.extit para que solo se ejecute hasta este punto y no siga ejecutando
            // Y truene el codigo.
        }
        String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\n Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\n Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}

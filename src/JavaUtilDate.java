import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("La fecha: " + fecha);
        SimpleDateFormat df = new SimpleDateFormat("dd - MM - yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("La fecha con formato es: " + fechaStr);
        // Se pueden ingressar formatos mas personalizados de la siguiente manera

        SimpleDateFormat df1 = new SimpleDateFormat("'Dia ' dd ' de ' MMMM ' del año ' yyyy");
        fechaStr = df1.format(fecha);

        System.out.println("La fecha con mas formato: " + fechaStr);
    }
}

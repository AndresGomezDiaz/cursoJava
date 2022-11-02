import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.FileInputStream;
import java.util.Properties;

public class PropiedadesDeSistema {
    public static void main(String[] args) {

        // Uso de sistemas de variables:
        String username = System.getProperty("user.name");
        System.out.println("El nombre del usuario es: " + username);

        Properties p = System.getProperties();
        System.out.println("El nombre del usuario otra vez: " + p.getProperty("user.name"));
        p.setProperty("mi.propiedad.nueva","PROPIEDAD");
        System.out.println("La propiedad personalizada: "+ p.getProperty("mi.propiedad.nueva"));
        System.out.println("#############################################");
        // Para cargar nuevas propiedades de sistema desde un archivo properties
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties properties = new Properties();
            properties.load(archivo);
            System.setProperties(properties);

            System.out.println("Listamos las propiedades cargadas: ");
            // System.getProperties().list(System.out);
            System.out.println(properties.getProperty("MINOMBREDEUSUARIO"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("AMBIENTE"));

        } catch(Exception e) {
            System.out.println("El archivo no existe");
        }


    }
}

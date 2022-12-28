import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.Normalizer;

public class EjercicioTest {
    public static void main(String[] args) {
        String ocupacion  = "Dueño / Propietario Así";
        System.out.println("Texto normal: " + ocupacion);

        String[] caracteresEspeciales = {"á", "é", "í", "ó", "ú", "Á", "É", "Í", "Ó", "Ú"};
        String[] caracteresNormales   = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        for (int i = 0; i < caracteresEspeciales.length; i++) {
            ocupacion = ocupacion.replace(caracteresEspeciales[i],caracteresNormales[i]);
        }
        System.out.println("Texto normal especiales: " +ocupacion);

        // Quitamos caracteres espciales:
        ocupacion = ocupacion.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println("Sin caracters especiales: " +ocupacion);

        ocupacion = ocupacion.toUpperCase();
        System.out.println("Todo en mayusculas: " +ocupacion);

        /*
        Forma de reemplazar, pero se lleva todos los caracteres
        ocupacion = Normalizer.normalize(ocupacion, Normalizer.Form.NFC)
                    .replaceAll("[^\\p{ASCII}]", "");
        System.out.println(ocupacion);
         */
    }
}

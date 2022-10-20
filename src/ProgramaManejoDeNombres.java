import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        /*
        Se que aún no llegamos a esto, pero quería agregarlo algo de dinámico.
        * */
        ArrayList<String> nombres = new ArrayList<String>();

        System.out.println("*** Tarea de la sección 3 ***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inrgesa el nombre del primer integrante de tu familia: ");
        // String nombre1 = scanner.nextLine();
        nombres.add(scanner.nextLine());
        System.out.println("Inrgesa el nombre del segundo integrante de tu familia: ");
        // String nombre2 = scanner.nextLine();
        nombres.add(scanner.nextLine());
        System.out.println("Inrgesa el nombre del tercer integrante de tu familia: ");
        // String nombre3 = scanner.nextLine();
        nombres.add(scanner.nextLine());

        String textoFinal = "";

        for(int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
            textoFinal += nombres.get(i).substring(1, 2).toUpperCase() + "." + nombres.get(i).substring(nombres.get(i).length() - 2) + "_";
        }
        textoFinal = textoFinal.substring(0, textoFinal.length()-1);
        System.out.println(textoFinal);

    }
}

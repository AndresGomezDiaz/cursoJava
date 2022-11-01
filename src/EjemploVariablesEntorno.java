import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        // Map es un array asociativo
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de entorno: " + varEnv);
    }
}

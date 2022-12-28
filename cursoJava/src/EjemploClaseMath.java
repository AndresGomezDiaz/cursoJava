import java.util.Random;

public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("El valor absoluto de -3 es: " + absoluto);

        int absoluto1 = Math.abs(3);
        System.out.println("El valor absoluto de 3 es: " + absoluto1);

        double max = Math.max(3.5, 1.2);
        System.out.println("El valor maximo de max es: " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("El valor minimo de min es: " + min);

        double techo =  Math.ceil(3.5);
        System.out.println("El valor redoneado de techo es: " + techo);

        double piso =  Math.floor(3.5);
        System.out.println("El valor redoneado de piso es: " + piso);

        long redondeo = Math.round(3.5);
        System.out.println("Se redondea el valor de redondeo a: " + redondeo);

        // Podemos genear un random con math pero solo dará un valor entre 0 y 1
        double random = Math.random();
        System.out.println("El valor random es: " + random);

        // O bien podemos usar random de Utils
        Random randomObj = new Random();
        int randomUtil = randomObj.nextInt();
        System.out.println("El random util es:  " + randomUtil);
        // el valor siempre sera un aleatorio dependiendo del valor next que se elija
        // Podemos definir que solo tome un valor entre 0 y 7
        int randomUtil1 = randomObj.nextInt(7);
        System.out.println("El random entre 0 y 6: " + randomUtil1);
        // O bien un valor entre 15 y 25
        int randomUtil2 = 15 + randomObj.nextInt(25-15+1);
        System.out.println("Un valor entre 15 y 25: " + randomUtil2);
    }
}

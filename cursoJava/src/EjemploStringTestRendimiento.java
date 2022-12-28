public class EjemploStringTestRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        // String builder es mutable a diferencia que el string

        long inicio = System.currentTimeMillis();
        // Vamos a evaluar el tiempo de usar concat
        for(int i = 0; i < 500; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms
            // c += a + b + "\n"; // 500 => 19ms
            sb.append(a) .append(b) .append("\n"); // 55500 => 0ms
        }
        /*
        * Para sumar cadenas en ciclos pequeños es mejor usar concat
        * en ciclos muy grandes es mejor unir con el signo +
        * Pero para cualquier caso con String Builder es mucho más eficiente
        * */
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        // System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}

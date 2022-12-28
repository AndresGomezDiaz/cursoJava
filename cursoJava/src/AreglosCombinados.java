public class AreglosCombinados {
    public static void main(String[] args) {
        int[] a, b, c;
        a = new int[10];
        b = new int[10];
        int totalC = a.length + b.length;
        c = new int[totalC];

        // Poblamos el arreglo a
        for(int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        // Poblamos el arreglo b
        for(int i = 0; i < b.length; i++) {
            b[i] = (i+1)*5;
        }
        // Unimos los 2 arreglos (a y b) en uno (c)
        int aux = 0;
        for(int i = 0; i < 10; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }

        for(int i = 0; i < c.length; i++) {
            System.out.println("El valor de c en " + i + " es: " + c[i]);
        }

    }
}

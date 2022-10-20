public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "imagen.ejemplo.pdf";
        System.out.println("Ejemplo con Split");
        System.out.println("El nombre del archivo: " + archivo);
        String[] archivoDiv = archivo.split("\\.");
        System.out.println("El nombre del archivo: " + archivoDiv[0]);
        System.out.println("La extención del archivo: " + archivoDiv[1]);

        // Para mejorar esto:
        System.out.println("Ejemplo con Split con puntos intermedios");
        String[] archivoDiv1 = archivo.split("\\.");
        String nombreArchivo = "";
        for(int i = 0; i < archivoDiv1.length-1; i++) {
            nombreArchivo += i == 0 ? archivoDiv1[i] : "."+archivoDiv1[i];

        }
        System.out.println("El nombre del archivo: " + nombreArchivo);
        System.out.println("La extención del archivo: " + archivoDiv1[archivoDiv1.length - 1]);


        // Otra forma:
        System.out.println("Ejemplo con indexOf");
        int i = archivo.indexOf(".");
        System.out.println("2. La extención del archivo: " + archivo.substring(i+1));
        // Pero para mejorar esto:
        System.out.println("Ejemplo con lastIndexOf");
        int i1 = archivo.lastIndexOf(".");
        System.out.println("3. La extención del archivo: " + archivo.substring(i+1));
    }
}

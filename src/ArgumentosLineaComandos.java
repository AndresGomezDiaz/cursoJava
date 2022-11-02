
public class ArgumentosLineaComandos {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Debe ingresar argumentos");
            System.exit(-1);
        }
        for(int i = 0; i < args.length; i++) {
            System.out.println("Argumento numero = " + i + "Con el valor de: " + args[i]);
        }
        /*
        El comando para compilar es:
        javac NOMBREDELARCHIVO.java
        Pero para correr el archivo es:
        java NOMBREDELACLASE
        *** En caso de recibir error: no se ha encontrado o cargado la clase principal ArgumentosLineaComandos.java
        Podemos ejecutar el comando con la liga completa al archivo .class
        java -cp E:\Desarrollos\proyectos\JavaUdemy\cursoJava\src ArgumentosLineaComandos Andres Pepe
        *** En caso de que est&eacute; dentro de un paquete ser&iacute;a:
        java paquete.ArgumentosLineaComandos Andres Pepe
        Si colocamos la bandera -encoding utf8 la clase va imprimir los acentos y caracteres raros de forma normal

        */
    }
}

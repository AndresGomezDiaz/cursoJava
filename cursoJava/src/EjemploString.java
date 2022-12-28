public class EjemploString {
    public static void main(String[] args) {
        String texto1 = "Este es el curso de Java";
        String texto2 = new String("Este es otra forma de instanciar un String");
        // Para validar 2 strings por valor:
        System.out.println(texto1.equals(texto2));
        // Para validar 2 strings sin contemplar mayusculas o minusculas, solo el valor
        System.out.println(texto1.equalsIgnoreCase(texto2));

        // Concatenación:
        String curso = "Programación en Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 15;

        System.out.println("La suma de los valores: " + (numeroA + numeroB));

        String detalle2 = curso.concat(" con ".concat(profesor));
        // Concat es mejor que concat, ya que por cada signo + se crea una instancia de string builder
        // Los strings son INMUTABLES, por lo que se generan instancias diferentes
        // Para escapar comillas dobles, es necesario poner diagonal inversa (\) y las comillas dobles (\")
        System.out.println(detalle2);

        // Esto es con funciones lamda o anónminas o de flecha.
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println(curso);
        System.out.println(resultado2);

        //Veamos el replace:
        String resultado3 = resultado2.replace("a", "A");
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}

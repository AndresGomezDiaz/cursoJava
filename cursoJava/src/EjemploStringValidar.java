public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNulo = curso == null;
        System.out.println(esNulo);
        if(esNulo){
            curso = " ";
        }
        if(!esNulo) {
            System.out.println(curso.toUpperCase());
        }
        System.out.println(curso.toUpperCase());

        // Un string podemos evaluarlo igual con isEmpty() solo de 6 en adelante
        boolean esVacio = curso.isEmpty();
        System.out.println(esVacio);

        // O validarlo con isBlank que es mas estricto solo de 11 en adelante
        boolean esVacio2 = curso.isBlank();
        System.out.println(esVacio2);

        /*
        * Es importante validar que un String no sea null ya que puede ocasionar un error
        * NullPointerException
        * ya que no aplican las funciones para String en esos casos.
        * en tal caso es mejor iniciar la variable con un valor vacio
        * */

    }
}

public class CharPrimitivos {
    public static void main(String[] args) {
        char caracter = 'a';
        char caracterUnicode = '\u0040';
        char caracterDecimal = 64;
        // Solo es valido para un caracter y se puede manejar elementos unicode
        // O valores decimales
        System.out.println("El valor de caracter es: " + caracter);
        System.out.println("El valor de caracterUnicode es: " + caracterUnicode);
        System.out.println("El valor de caracterDecimal es: " + caracterDecimal);

        System.out.println("El tipo char corresponde en byte a: " + Character.BYTES);
        System.out.println("El tipo char corresponde en bites a: " + Character.SIZE);
        System.out.println("El valor maximo de un char es: " + Character.MAX_VALUE);
        System.out.println("El valor manimo de un char es: " + Character.MIN_VALUE);




    }
}

public class ConversionTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int enteroNumeroInt = Integer.parseInt(numeroStr);
        System.out.println("El numero entero: " + enteroNumeroInt);

        String numeroRealStr = "98765.43e-3";
        double realDouble = Double.parseDouble(numeroRealStr);
        System.out.println("El real: " + realDouble);

        String logicoStr = "TRUE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("El valor booleano es: " + logicoBoolean);
        // Para las conversiones de booleanos, solo aplica true si es tal cual
        // la palabra true, sin importar mayúsculas o minúsculas

        // Para convertir a string
        String intToString = Integer.toString(enteroNumeroInt);
        System.out.println("Entero como string: " + intToString);
        String otroEntero = String.valueOf(enteroNumeroInt);
        System.out.println("Entero como string pero con valueOf: " + otroEntero);
        // Value Of acepta cualquier tipo de dato
        String realToString = String.valueOf(realDouble);
        System.out.println("Real como string: " + realToString);

        // Convertir entre primitivos
        int i = 42768;
        short s = (short)i;
        // Cuando se quiere convertir a un numero mas pequeño puede haber perdida
        // Por eso se fuerza con un cast, y aún así puede existir perdida de información.
        long l = i;
        System.out.println("El valor de i:" + i + "\nel valor de s: " + s + "\nel valor de l: " + l);


    }
}

class Persona {
    private String nombre;

    public void modificaNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        // Vamos a usar arreglos ya que trabajan por
        // referencias o punteros
        Persona persona = new Persona();
        persona.modificaNombre("Andres");

        System.out.println("El nombre de la persona es: " + persona.leerNombre());

        System.out.println("Antes de invocar al metodo test");
        test(persona);
        System.out.println("Despues de invocar al metodo test");
        System.out.println("El nombre de la persona es: " + persona.leerNombre());
        System.out.println("Finaliza el metodo main");
        // Debido a que es un metodo de referencia
        // y apuntan al mismo puntero, por eso se modifica
        // el valor de Persona.
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test");
        persona.modificaNombre("Pepe");
        System.out.println("Finalizamos el metodo test");
    }
}

package org.agomez.genericsclass;

public class EjemploGenericosClase {
    public static void main(String[] args) {
        System.out.println("### Los Animales:");
        Camion transporteCaballos = new Camion(5);
        transporteCaballos.add(new Animal("Peregrino", TipoAnimal.CABALLO.toString()));
        transporteCaballos.add(new Animal("Juancho", TipoAnimal.CABALLO.toString()));
        transporteCaballos.add(new Animal("Grillo", TipoAnimal.CABALLO.toString()));
        transporteCaballos.add(new Animal("Aquiles", TipoAnimal.CABALLO.toString()));

        for(Object o: transporteCaballos) {
            Animal a = (Animal) o;
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }
        System.out.println("### Las Maquinarias:");
        Camion transporteMaquinas = new Camion(2);
        transporteMaquinas.add(new Maquinaria("Bulldozer"));
        transporteMaquinas.add(new Maquinaria("Grua"));
        transporteMaquinas.add(new Maquinaria("Perforadora"));


        for(Object o: transporteMaquinas) {
            Maquinaria a = (Maquinaria) o;
            System.out.println("Tipo: " + a.getTipo());
        }
        System.out.println("### Los Autos:");
        Camion transporteAutomovil = new Camion(8);
        transporteAutomovil.add(new Automovil("Mazda"));
        transporteAutomovil.add(new Automovil("Nissan"));
        transporteAutomovil.add(new Automovil("BMW"));
        transporteAutomovil.add(new Automovil("Audi"));
        transporteAutomovil.add(new Automovil("Chevrolet"));

        for(Object o: transporteAutomovil) {
            Automovil a = (Automovil) o;
            System.out.println("Autmovil Marca: " + a.getMarca());
        }

        // Usamos el Generics de camion
        System.out.println("### Los Animales Genericos:");
        CamionGen<Animal> transporteGenAnimales = new CamionGen<>(5);
        transporteGenAnimales.add(new Animal("Peregrino", TipoAnimal.CABALLO.toString()));
        transporteGenAnimales.add(new Animal("Juancho", TipoAnimal.CABALLO.toString()));
        transporteGenAnimales.add(new Animal("Grillo", TipoAnimal.CABALLO.toString()));
        transporteGenAnimales.add(new Animal("Aquiles", TipoAnimal.CABALLO.toString()));

        /*
        * Con la clase generica nos evitamos hacer el cast de objeto al tipo de clase
        * que estamos usando, y así es mas límpio el código.
        * */
        for(Animal a: transporteGenAnimales) {
            System.out.println(a.getNombre() + " tipo: " + a.getTipo());
        }

    }
}

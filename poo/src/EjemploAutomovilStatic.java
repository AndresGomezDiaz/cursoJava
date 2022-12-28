public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(50);

        Automovil auto = new Automovil("Kia", "Rio");
        Automovil auto2 = new Automovil("Honda", "Civic");
        Automovil auto3 = new Automovil();
        Automovil auto4 = new Automovil("Kia", "Rio");

        Motor motorAuto = new Motor(2.1,TipoMotor.DIESEL);
        auto.setMotor(motorAuto);
        auto.setColor(Color.ROJO);
        Motor motorAuto2 = new Motor(1.5, TipoMotor.GASOLINA);
        auto2.setMotor(motorAuto2);
        auto2.setColor(Color.AZUL);

        Automovil.setColorPatente(Color.NARANJA);

        System.out.println(auto.verDetalle());
        System.out.println("***");
        System.out.println(auto2.verDetalle());
        System.out.println("***");
        System.out.println(auto3.verDetalle());
        System.out.println("***");
        System.out.println(auto4.verDetalle());
        System.out.println("***");
        /*
        * Las funciones estáticas lo correcto es que se invoquen
        * desde la clase no desde el objeto
        * */
        System.out.println(Automovil.calculaConsumoEstatico(300, 60));
        System.out.println("El color patente es: " + Automovil.getColorPatente().getColor());

        System.out.println(Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println(Automovil.VELOCIDAD_MAX_CIUDAD);

    }
}

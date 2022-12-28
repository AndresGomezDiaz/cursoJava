public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil auto = new Automovil("Kia", "Rio");
        Automovil auto2 = new Automovil("Honda", "Civic");
        Automovil auto3 = new Automovil();
        Automovil auto4 = new Automovil("Kia", "Rio");

        Motor motorAuto = new Motor(4, TipoMotor.GASOLINA);
        auto.setMotor(motorAuto);
        auto.setColor(Color.VERDE);

        Motor motorAuto2 = new Motor(4, TipoMotor.GASOLINA);
        auto2.setMotor(motorAuto2);
        auto2.setColor(Color.AZUL);

        System.out.println(auto.verDetalle());
        System.out.println(auto.acelerarFrenar(3000));
        System.out.println(auto2.acelerarFrenar(4000));
        System.out.println("El " + auto.getFabricante() + " tiene un consumo de "
                    + auto.calculaConsumo(300, 0.6f));
        System.out.println("El " + auto.getFabricante() + " tiene un consumo de "
                    + auto.calculaConsumo(300, 60));

        // Probamos el metodo personalizado que creamos:
        System.out.println("Vamos a comparar autos:");
        // Como esto se hace por referencia no son iguales, ya que son objetos diferentes
        System.out.println("Son iguales? " + (auto == auto4));
        // Modificamos el equals para que compare por valor sobre
        // los datos de fabricante y modelo.
        System.out.println("Son iguales2: " + (auto.equals(auto4)));
        System.out.println("Probamos con un auto vacio: " + auto.equals(auto3));
    }
}

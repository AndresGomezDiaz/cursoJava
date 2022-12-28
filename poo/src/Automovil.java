public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private int anio;
    private TanqueGasolina tanqueGasolina;
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;
    private Persona propietario;
    private Rueda[] ruedas;

    /*
    * Dentro de los constructures, podemos asignar
    * directamente los valores, para evitar usar seters.
    * y se pueden tener diversos constructures (sobrecarga)
    *
    * */
    public Automovil() {
        this.id = ++ultimoId;
    }
    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        /*
        * Podemos utiliza sobrecarga de constructor, mandando llamar
        * a un constructor anterior
        * */
        this(fabricante, modelo);
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        this.color = color;
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color,
                     Motor motor, TanqueGasolina tanqueGasolina, int anio) {
        this(fabricante, modelo, color, motor);
        this.tanqueGasolina = tanqueGasolina;
        this.anio = anio;
    }


    /*
    * Las variables estáticas le pertenecen a la clase
    * no al objeto como tal, por lo que si se modifica desde otro lado
    * cambia para todas las llamadas a esta variable dentro del objeto Automovil
    * */
    private static Color colorPatente = Color.NARANJA;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final Integer VELOCIDAD_MAX_CIUDAD = 80;

    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_GRIS = "Gris";
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AZUL = "Azul";


    public String verDetalle() {
        // no es buena Práctica imprimir en un detalle dentro de un objeto
        // Las variables/atributos estaticas no es necesario llamarlas con this
        return "El id es: " + this.id +
                "\nEl fabricante: " + this.fabricante +
                "\nEl modelo: " + this.modelo +
                "\nEl color: " + this.color +
                "\nEl color de Patente es " + Automovil.colorPatente +
                "\nEl cilindrada: " + this.motor.getNumCilindros();
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + " rpm.";
    }
    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }
    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calculaConsumo(int km, float porcentajeGasolina) {
        return km/((float)tanqueGasolina.getCapacidad() * porcentajeGasolina);
    }
    /*
    * Esto es el principio de encapsulamiento, cuando usamos un mismo
    * nombre de función pero con diferente tipos de parametros
    * o bien también se le conoce como polimorfismo
    * */
    public float calculaConsumo(int km, int porcentajeGasolina) {
        return km/((float)tanqueGasolina.getCapacidad() * porcentajeGasolina/100f);
    }

    /*
    * Un método estático solo puede utilizar variables/argumentos estaticas dentro
    * de su contexto
    * */
    public static float calculaConsumoEstatico(int km, int porcentajeGasolina) {
        return km/(Automovil.capacidadTanqueEstatico * porcentajeGasolina/100f);
    }

    public String getFabricante() {
        return this.fabricante;
    }
    public String getModelo() {
        return this.modelo;
    }
    public Color getColor() {
        return this.color;
    }

    public TanqueGasolina getTanqueGasolina() {
        return this.tanqueGasolina;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public void setMotor(Motor moto) {
        this.motor = motor;
    }
    public void setTanqueGasolina(TanqueGasolina tanqueGasolina) {
        this.tanqueGasolina = tanqueGasolina;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public Motor getMotor() {
        return motor;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    /*
    * Override sirve para documentar que se está
    * sobreescribiendo un método padre
    *
    * */
    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil)obj;

        // Validamos si son iguales por referencia
        if(this == obj) {
            return true;
        }

        // Validamos que el objeto sea un automovil
        if(!(obj instanceof Automovil)) {
            return false;
        }

        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }
}

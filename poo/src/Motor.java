public class Motor {
    private double numCilindros;
    private TipoMotor tipoMotor;

    public Motor() {

    }

    public Motor(double numCilindros, TipoMotor tipoMotor) {
        this.numCilindros = numCilindros;
        this.tipoMotor = tipoMotor;
    }

    public double getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(double numCilindros) {
        this.numCilindros = numCilindros;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}

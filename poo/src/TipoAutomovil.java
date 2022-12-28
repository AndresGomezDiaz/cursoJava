public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    HATCHBACK("Hatchback", "Auto mediano", 4),
    PICKUP("Pickup", "Auto grande", 6),
    COUPE("Coupe", "Auto pequeño", 4),
    CONVERTIBLE("Convertible", "Auto pequeño", 2);
    private final String nombre;
    private final String descripcion;
    private final int numPersonas;
    TipoAutomovil(String nombre, String descripcion, int numPersonas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numPersonas = numPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumPersonas() {
        return numPersonas;
    }
}

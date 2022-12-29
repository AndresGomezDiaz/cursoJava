package org.andres.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String description;
    private Date fechaFactura;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS_X_PROD = 10;
    private static int ultimoFolio;

    public Factura(String description, Cliente cliente) {
        this.description = description;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS_X_PROD];
        this.folio = ++ultimoFolio;
        this.fechaFactura = new Date();
    }

    public int getFolio() {
        return folio;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getFechaFactura() {
        return fechaFactura;
    }
    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ItemFactura[] getItem() {
        return items;
    }
    public void addItemFactura(ItemFactura item) {
        if(indiceItems < MAX_ITEMS_X_PROD) {
            this.items[indiceItems++] = item;
        }
    }
    public float calcularTotal() {
        float total = 0.0f;
        for(int i = 0; i < indiceItems; i++) {
            // ItemFactura item = this.items[i];
            // Podemos validar si item no es instancia de itemFactura, es decir es nulo
            // if(!(item instanceof ItemFactura)) {
                //continue;
            //Cambiamos el foreach por un for normal pero iteramos solo los que agreguemos
            //if(item == null) {
                //continue;
            //}
            total += this.items[i].calcularImporte();
        }
        return total;
    }
    public String generaDetalle() {
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t Tax: ")
                .append(this.cliente.getTax())
                .append("\nDescripción: ")
                .append(this.description)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, YYYY");
        sb.append("Fecha Emisión: ")
                .append(df.format(this.fechaFactura))
                .append("\n")
                .append("\n#\tNombre\tCant.\tTotal\n");

        for(int i = 0; i < indiceItems; i++) {
            /*
            sb.append(item.getProducto().getCodigo())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.calcularImporte())
                    .append("\n");
             */
            sb.append(this.items[i].toString())
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());
        return sb.toString();
    }

    @Override
    public String toString() {
        return generaDetalle();
    }
}

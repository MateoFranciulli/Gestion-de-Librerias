package dominio;

import java.io.Serializable;

public class Ventas implements Serializable{
    private String fecha;
    private String cliente;
    private int factura;
    private int precio;
    private int importe;

    public Ventas(String fecha, String cliente,int factura, int precio, int importe) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.precio = precio;
        this.importe = importe;
        this.factura= factura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
  
   
}

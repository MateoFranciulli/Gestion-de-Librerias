/*
    Autores:
    Mateo Franciulli 310956
    Ivan Castelli 306188
 */

package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Ventas implements Serializable{
    private String fecha;
    private String cliente;
    private int factura;
    private double precio;
    private double precioVenta;
    private int cantidad;
    private ArrayList<Libro> librosVendidos;
    
    public Ventas(String fecha, String cliente, double precio, int factura, int cantidad, ArrayList<Libro> librosVendidos) {
        this.cantidad = cantidad; 
        this.fecha = fecha;
        this.cliente = cliente;
        this.precio = precio;
        this.factura= factura;
        this.librosVendidos=librosVendidos != null ? librosVendidos : new ArrayList<>();;
        System.out.println("Libros vendidos inicializados: " + (librosVendidos != null ? librosVendidos.size() : "null"));
    }

  
    public void agregarLibroVendido(Libro libro, int cantidad) {
        libro.setCantidadVendidoEnVenta(cantidad);
        this.librosVendidos.add(libro);
    }
    
    public ArrayList<Libro> getLibrosVendidos() {
        return librosVendidos;
    }

    public void setLibrosVendidos(ArrayList<Libro> librosVendidos) {
        this.librosVendidos = librosVendidos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
   
    
    @Override
    public String toString() {
        return "Venta:" +
                "\n Fecha: " + fecha +
                "\n Cliente: " + cliente +
                "\n Precio: " + precio + 
                "\n Factura: "+ factura +
               
               "\n Libros" + librosVendidos;
   
    }
}

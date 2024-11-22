/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author Ivanc
 */
public class Libro implements Serializable {
private String isbn ;
private String titulo;
private String editorial;
private String genero;
private String autor;
private double precioCosto;
private double precioVenta;
private int ejemplares;
private int cantidadVendido=0;//Valor aux


    public Libro(String isbn, String titulo, double precioCosto, double precioVenta, int ejemplares, String editorial, String genero, String autor, int cantidadVendido) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.precioCosto = precioCosto;
    this.precioVenta = precioVenta;
    this.ejemplares = ejemplares;
    this.editorial = editorial;
    this.genero = genero;
    this.autor = autor;
    this.cantidadVendido =cantidadVendido;// Inicializar a 0
    
    }

    public int getCantidadVendido() {
        return cantidadVendido;
    }

    public void setCantidadVendido(int cantidadVendido) {
        this.cantidadVendido = cantidadVendido;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial + ", genero=" + genero + ", autor=" + autor 
                + ", precioCosto=" + precioCosto + ", precioVenta=" + precioVenta + ", ejemplares=" + ejemplares  + '}';
    }
    
    
}

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


    public Libro(String isbn, String titulo, double precioCosto, double precioVenta, int ejemplares, String editorial, String genero, String autor) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.precioCosto = precioCosto;
    this.precioVenta = precioVenta;
    this.ejemplares = ejemplares;
    this.editorial = editorial;
    this.genero = genero;
    this.autor = autor;
    
    }

    
    
}

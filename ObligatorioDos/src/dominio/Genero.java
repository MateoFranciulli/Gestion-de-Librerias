/*
    Autores:
    Mateo Franciulli 310956
    Ivan Castelli 306188
 */

package dominio;

import java.io.Serializable;

public class Genero implements Serializable{
    
private String nombre;
private String descripcion;

    public Genero(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

      @Override
    public String toString() {
        return "Género:"+"\n Nombre: "+nombre+ " \n Descripción: "+ descripcion ;
    }

}

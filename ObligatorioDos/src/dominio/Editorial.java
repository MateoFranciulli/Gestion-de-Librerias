/*
    Autores:
    Mateo Franciulli 310956
    Ivan Castelli 306188
 */
package dominio;
import dominio.*;
import java.io.Serializable;

public class Editorial implements Serializable{

private String nombre;
private String pais;

    public Editorial(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
      @Override
    public String toString() {
        return "Editorial:"+"\n Nombre: "+nombre+ " , Pais: "+ pais ;
    }
    
}

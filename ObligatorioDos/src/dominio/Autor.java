package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Autor implements Serializable{
    private String nombre;
    private String nacionalidad;
    private ArrayList<Genero> generos;

    public Autor(String nombre, String nacionalidad, ArrayList<Genero> generos) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.generos = generos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "Autor:" +
                "\n Nombre: " + nombre +
                "\n Nacionalidad: " + nacionalidad +
                "\n Géneros: " + generos.stream().map(Genero::getNombre).reduce((a, b) -> a + ", " + b).orElse("");
    }
}
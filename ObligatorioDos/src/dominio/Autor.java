package dominio;

public class Autor {
    private String nombre;
    private String nacionalidad;
    private Genero genero; // saco el genero de la clase genero

    public Autor(String nombre, String nacionalidad, Genero genero) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Autor:" +
                "\n Nombre: " + nombre +
                "\n Nacionalidad: " + nacionalidad +
                "\n Género: " + genero.getNombre();
    }
}
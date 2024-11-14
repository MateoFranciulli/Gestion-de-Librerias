package dominio;
import dominio.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;




public class Modelo extends Observable implements Serializable{    
 private static final long serialVersionUID = 1L;    
//private static final long serialVersionUID = -8391326021940632313L;
    public Modelo() throws IOException{
        cargarDatos();
    }
  
    public static ArrayList<Editorial> editoriales = new ArrayList<>();

    public void agregarEditorial(Editorial editorial) {
        editoriales.add(editorial);
        setChanged(); 
        notifyObservers(editorial);
        guardarDatos();
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }
    public static boolean verificoEditorial(String nombre) {
        boolean retorno = true;
        for (Editorial editorial : editoriales) {
            if (editorial.getNombre().equalsIgnoreCase(nombre)) {
                retorno = false; // Retorna false si se encuentra una coincidencia
            }
        }
        return retorno ; 
    }
   
    //VERIFICACIONES GENERO
    public static ArrayList<Genero> generos = new ArrayList<>();

    public void agregarGenero(Genero genero) {
        generos.add(genero);
        setChanged(); 
        notifyObservers(genero);
        guardarDatos();
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }
    public static boolean verificoGeneros(String nombre) {
        boolean retorno = true;
        for (Genero genero : generos) {
            if (genero.getNombre().equalsIgnoreCase(nombre)) {
                retorno = false; // Retorna false si se encuentra una coincidencia
            }
        }
        return retorno ; 
    }
    
    public Genero obtenerGeneroPorNombre(String nombre) {
    for (Genero genero : generos) {
        if (genero.getNombre().equals(nombre)) {
            return genero;
        }
    }
    return null;
}
    
    //VERIFICACIONES AUTOR
    
    public static ArrayList<Autor> autores = new ArrayList<>();

    public void agregarAutor(Autor autor) {
        autores.add(autor);
        setChanged();
        notifyObservers(autor);
        guardarDatos();
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }
    public static boolean verificoAutores(String nombre) {
        boolean retorno = true;
        for (Autor autor: autores) {
            if (autor.getNombre().equalsIgnoreCase(nombre)) {
                retorno = false; // Retorna false si se encuentra una coincidencia
            }
        }
        return retorno ; 
    }
    
    public void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sistema"))) {
            out.writeObject(this);
        } catch (IOException e) {
            System.out.println("No se pudo guardar los datos: " + e.getMessage());
        }
        setChanged();
        notifyObservers();
    }

    public void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("sistema"))) {
            Modelo modelo = (Modelo) in.readObject();
            editoriales = modelo.editoriales != null ? modelo.editoriales : new ArrayList<>();
            generos = modelo.generos != null ? modelo.generos : new ArrayList<>();
            autores = modelo.autores != null ? modelo.autores : new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo cargar los datos: " + e.getMessage());
        }
    }
    
    /*
    public void guardarDatos() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sistema"));
            out.writeObject(this);
            out.close();
        } catch(IOException e) {
            System.out.println("No hay datos"); 
        }
        notifyObservers();
    }
*/
    @Override
    public void notifyObservers(){
        setChanged();
        super.notifyObservers();
    }
    
}
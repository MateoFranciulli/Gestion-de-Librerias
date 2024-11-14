package dominio;
import dominio.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;




public class Modelo extends Observable {    
    public Modelo(){
        
    }
  
    public static ArrayList<Editorial> editoriales = new ArrayList<>();

    public void agregarEditorial(Editorial editorial) {
        editoriales.add(editorial);
        setChanged(); 
        notifyObservers(editorial);
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
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sistema"));
            out.writeObject(this);
            out.close();
        } catch(IOException e) {
            System.out.println("No hay datos"); 
        }
        notifyObservers();
    }

    
    
}
package dominio;

import java.io.*;
import java.util.*;

public class Modelo extends Observable implements Serializable {

    public ArrayList<Editorial> editoriales = new ArrayList<>();
    public ArrayList<Genero> generos = new ArrayList<>();
    public ArrayList<Autor> autores = new ArrayList<>();
    public ArrayList<Libro> libros = new ArrayList<>();
    public ArrayList<Ventas> ventas = new ArrayList<>();
    private int numeroFactura;
    
    public Modelo() {
        cargarDatos();
        this.numeroFactura = 1;
    }

     public int getNumeroFactura() {
        return numeroFactura;
    }

    public void incrementarNumeroFactura() {
        this.numeroFactura++;
    }
    
    
    
    public void agregarEditorial(Editorial editorial) {
        editoriales.add(editorial);
        setChanged();
        notifyObservers(editorial);
        guardarDatos();
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public  boolean verificoEditorial(String nombre) {
        for (Editorial editorial : editoriales) {
            if (editorial.getNombre().equalsIgnoreCase(nombre)) {
                return false;
            }
        }
        return true;
    }

    public void agregarGenero(Genero genero) {
        generos.add(genero);
        setChanged();
        notifyObservers(genero);
        guardarDatos();
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public  boolean verificoGeneros(String nombre) {
        for (Genero genero : generos) {
            if (genero.getNombre().equalsIgnoreCase(nombre)) {
                return false;
            }
        }
        return true;
    }

    public Genero obtenerGeneroPorNombre(String nombre) {
        for (Genero genero : generos) {
            if (genero.getNombre().equals(nombre)) {
                return genero;
            }
        }
        return null;
    }

    public void agregarAutor(Autor autor) {
        autores.add(autor);
        setChanged();
        notifyObservers(autor);
        guardarDatos();
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public  boolean verificoAutores(String nombre) {
        for (Autor autor : autores) {
            if (autor.getNombre().equalsIgnoreCase(nombre)) {
                return false;
            }
        }
        return true;
    }

    public void agregarLibro(Libro libro) {
         if (libros == null) { // Ensure libros is initialized
            libros = new ArrayList<>();
        }
        libros.add(libro);
        setChanged();
        notifyObservers(libro);
        guardarDatos();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
    public  boolean verificoLibros(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return false;
            }
        }
        return true;
    }
    
    public void guardarDatos() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sistema"));
            out.writeObject(this);
            out.close();
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("No se pudo guardar los datos: " + e.getMessage()); 
            e.printStackTrace();
        }
        notifyObservers();
    }

    public void cargarDatos() {
 
        File sistemaFile = new File("sistema");
        if (!sistemaFile.exists()) {
            System.out.println("No se encontro el archivo sistema. Creando un nuevo sistema.");
            return; 
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(sistemaFile))) {
            Modelo modelo = (Modelo) in.readObject();
            editoriales = modelo.editoriales != null ? modelo.editoriales : new ArrayList<>();
            generos = modelo.generos != null ? modelo.generos : new ArrayList<>();
            autores = modelo.autores != null ? modelo.autores : new ArrayList<>();
            libros = modelo.libros != null ? modelo.libros : new ArrayList<>();
            System.out.println("Datos cargados correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo cargar los datos: " + e.getMessage()); // avisarle al usuario 
            e.printStackTrace();
        }
    }
    
     public ArrayList<Ventas> getVentas() {
        return ventas;
    }
    
     public void agregarVentas(Ventas venta) {
        ventas.add(venta);
        setChanged();
        notifyObservers(ventas);
        guardarDatos();
    }     

    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }
}   /*
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
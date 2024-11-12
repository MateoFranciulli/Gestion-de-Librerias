package dominio;
import dominio.*;
import java.util.ArrayList;
import java.util.List;

public class Modelo {
    public static List<Editorial> editoriales = new ArrayList<>();

    public void agregarEditorial(Editorial editorial) {
        editoriales.add(editorial);
    }

    public List<Editorial> getEditoriales() {
        return editoriales;
    }
}
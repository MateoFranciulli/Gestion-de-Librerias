package dominio;

import java.util.Observable;
import java.util.Observer;


public class Observador implements Observer {
    private String nombre;

    public Observador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

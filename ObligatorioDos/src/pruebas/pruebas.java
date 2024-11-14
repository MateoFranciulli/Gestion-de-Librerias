package pruebas;
import dominio.Modelo;
import interfaz.*;


public class pruebas {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();         
        VentanaMenu vent=new VentanaMenu(modelo);
        vent.setVisible(true);
     
        
    
    }
 
}

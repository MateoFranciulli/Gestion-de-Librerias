/*
 * 
 * 
 */

/**
 *
 * @author mateofranciulli
 */
package dominio;

import java.util.ArrayList;
import java.util.List;
public class Observable {


    public List<Observer> observadores = new ArrayList<>();


    public void añadirObservador(Observer observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(Object arg) {
        for (Observer observador : observadores) {
            observador.actualizar(arg);
        }
    }
   }


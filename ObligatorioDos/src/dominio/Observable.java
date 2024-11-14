package dominio;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observadores = new ArrayList<>();
    private boolean cambiado = false;

    public void annadirObservador(Observer observador) {
        if (observador == null) {
            throw new NullPointerException();
        }
        if (!observadores.contains(observador)) {
            observadores.add(observador);
        }
    }

    public void eliminarObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(Object arg) {
        if (cambiado) {
            for (Observer observador : observadores) {
                observador.actualizar(arg);
            }
            cambiado = false;
        }
    }

    protected void cambiar() {
        cambiado = true;
    }

    protected void limpiarCambio() {
        cambiado = false;
    }

    public boolean haCambiado() {
        return cambiado;
    }

    public int contarObservadores() {
        return observadores.size();
    }
}
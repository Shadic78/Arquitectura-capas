/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capas;

/**
 *
 * @author Equipo1
 */
public abstract class Capa<entrada, salida> {
    private Capa siguienteCapa;
    private Capa capaAnterior;
    
    protected abstract salida doIt(entrada ob);
    
    protected abstract void handleResponse(entrada ob);
    
    public void setSiguienteCapa(Capa siguienteCapa) {
        this.siguienteCapa = siguienteCapa;
    }
    
    public void setCapaAnterior(Capa capaAnterior) {
        this.capaAnterior = capaAnterior;
    }
    
    public void ejecutarDoIt(entrada ob) {
        salida localObj = this.doIt(ob);
        if(capaAnterior != null) {
            capaAnterior.handleResponse(localObj);
        }
        if(siguienteCapa != null) {
            siguienteCapa.ejecutarDoIt(localObj);
        }
    }
    
}

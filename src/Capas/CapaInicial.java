/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capas;

/**
 *
 * @author Equipo1
 * @param <salidaCapaSiguiente> El tipo de dato a enviar a la siguiente capa
 * @param <respuestaCapaSiguiente> El tipo de dato con el que respondio la siguiente capa
 * @param <responderACapaSiguiente> El tipo de dato que se enviara a la siguiente capa como respuesta
 */
public abstract class CapaInicial<salidaCapaSiguiente, respuestaCapaSiguiente, responderACapaSiguiente> implements ICapaAnterior<salidaCapaSiguiente, respuestaCapaSiguiente, responderACapaSiguiente> {
    private ICapaSiguiente capaSiguiente;
    
    @Override
    public void enviarACapaSiguiente(salidaCapaSiguiente salida) {
        capaSiguiente.procesarEntradaCapaAnterior(salida);
    }

    @Override
    public void responderACapaSiguiente(responderACapaSiguiente respuestaAEnviar) {
        capaSiguiente.procesarRespuestaCapaAnterior(respuestaAEnviar);
    }

    @Override
    public void setCapaSiguiente(ICapaSiguiente capaSiguiente) {
        this.capaSiguiente = capaSiguiente;
    }
    
    public abstract void start();
    
}

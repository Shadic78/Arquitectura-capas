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
public abstract class CapaIntermedia<entradaCapaAnterior, responderACapaAnterior, respuestaCapaAnterior, salidaCapaSiguiente, responderACapaSiguiente, respuestaCapaSiguiente>
        implements ICapaAnterior<salidaCapaSiguiente, respuestaCapaSiguiente, responderACapaSiguiente>,
        ICapaSiguiente<entradaCapaAnterior, responderACapaAnterior, respuestaCapaAnterior> {

    private ICapaSiguiente capaSiguiente;
    private ICapaAnterior capaAnterior;

    @Override
    public void enviarACapaSiguiente(salidaCapaSiguiente salida) {
        capaSiguiente.procesarEntradaCapaAnterior(salida);
    }

    @Override
    public void responderACapaSiguiente(responderACapaSiguiente respuestaAEnviar) {
        capaSiguiente.procesarRespuestaCapaAnterior(respuestaAEnviar);
    }

    @Override
    public void responderACapaAnterior(responderACapaAnterior respuestaAEnviar) {
        capaAnterior.procesarRespuestaCapaSiguiente(respuestaAEnviar);
    }

    @Override
    public void setCapaSiguiente(ICapaSiguiente capaSiguiente) {
        this.capaSiguiente = capaSiguiente;
    }

    @Override
    public void setCapaAnterior(ICapaAnterior capaAnterior) {
        this.capaAnterior = capaAnterior;
    }
    
}

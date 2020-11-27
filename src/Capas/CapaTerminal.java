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
public abstract class CapaTerminal<entradaCapaAnterior, responderACapaAnterior, respuestaCapaAnterior> implements ICapaSiguiente<entradaCapaAnterior, responderACapaAnterior, respuestaCapaAnterior> {
    private ICapaAnterior capaAnterior;

    @Override
    public void responderACapaAnterior(responderACapaAnterior respuestaAEnviar) {
        capaAnterior.procesarRespuestaCapaSiguiente(respuestaAEnviar);
    }

    @Override
    public void setCapaAnterior(ICapaAnterior capaAnterior) {
        this.capaAnterior = capaAnterior;
    }

}

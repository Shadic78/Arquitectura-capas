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
public interface ICapaSiguiente<entradaCapaAnterior, responderACapaAnterior, respuestaCapaAnterior> {

    public void responderACapaAnterior(responderACapaAnterior respuestaAEnviar);

    public abstract void procesarEntradaCapaAnterior(entradaCapaAnterior entradaAnterior);

    public abstract void procesarRespuestaCapaAnterior(respuestaCapaAnterior respuestaAnterior);
    
    public void setCapaAnterior(ICapaAnterior capaAnterior);
    
}


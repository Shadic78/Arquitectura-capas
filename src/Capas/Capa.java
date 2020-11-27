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
public abstract class Capa<entradaCapaAnterior, responderACapaAnterior, respuestaCapaAnterior, salidaCapaSiguiente, responderACapaSiguiente, respuestaCapaSiguiente> {
    private Capa capaSiguiente;
    private Capa capaAnterior;
        
    protected void responderACapaAnterior(responderACapaAnterior respuestaAEnviar){
        capaAnterior.procesarRespuestaCapaSiguiente(respuestaAEnviar);
    }
    
    protected void enviarACapaSiguiente(salidaCapaSiguiente salida) {
        capaSiguiente.procesarEntradaCapaAnterior(salida);
    }
    
    protected void responderACapaSiguiente(responderACapaSiguiente respuestaAEnviar) {
        capaSiguiente.procesarRespuestaCapaAnterior(respuestaAEnviar);
    }
    
    protected abstract void procesarEntradaCapaAnterior(entradaCapaAnterior entradaAnteriors);
    
    protected abstract void procesarRespuestaCapaAnterior(respuestaCapaAnterior respuestaAnterior);
    
    protected abstract void procesarRespuestaCapaSiguiente(respuestaCapaSiguiente respuestaSiguiente);
    
}

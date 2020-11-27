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
public interface ICapaAnterior<salidaCapaSiguiente, respuestaCapaSiguiente, responderACapaSiguiente> {

    public void enviarACapaSiguiente(salidaCapaSiguiente salida);

    public void responderACapaSiguiente(responderACapaSiguiente respuestaAEnviar);

    public void procesarRespuestaCapaSiguiente(respuestaCapaSiguiente respuestaSiguiente);
    
    public void setCapaSiguiente(ICapaSiguiente capaSiguiente);

}

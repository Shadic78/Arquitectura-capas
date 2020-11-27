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
public interface ICapaAnterior<salidaCapaSiguiente, respuestaCapaSiguiente, responderACapaSiguiente> {

    public void enviarACapaSiguiente(salidaCapaSiguiente salida);

    public void responderACapaSiguiente(responderACapaSiguiente respuestaAEnviar);

    public void procesarRespuestaCapaSiguiente(respuestaCapaSiguiente respuestaSiguiente);
    
    public void setCapaSiguiente(ICapaSiguiente capaSiguiente);

}

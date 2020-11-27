/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputLayer;

import Capas.CapaInicial;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class InputOutputLayer extends CapaInicial<String, List<ArrayList<String>>, String> {

    private Entrada entrada;
    private Salida salida;

    public InputOutputLayer() {
        this.entrada = new Entrada();
        this.salida = new Salida();
    }

    @Override
    public void procesarRespuestaCapaSiguiente(List<ArrayList<String>> respuestaSiguiente) {
        salida.printStatements(respuestaSiguiente);
        super.responderACapaSiguiente("\nPrograma terminado");
    }

    @Override
    public void start() {
        String userInput = entrada.getUserInput();
        super.enviarACapaSiguiente(userInput);
    }

}

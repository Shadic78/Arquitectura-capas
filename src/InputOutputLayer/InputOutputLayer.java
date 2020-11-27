/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputLayer;

import Capas.Capa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class InputOutputLayer extends Capa<List<ArrayList<String>>, String> {

    private Entrada entrada;
    private Salida salida;

    public InputOutputLayer() {
        this.entrada = new Entrada();
        this.salida = new Salida();
    }

    @Override
    protected String doIt(List<ArrayList<String>> ob) {
        return entrada.getUserInput();
    }

    @Override
    protected void handleResponse(List<ArrayList<String>> statements) {
        salida.printStatements(statements);
    }

}

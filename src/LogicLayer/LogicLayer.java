/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicLayer;

import Capas.CapaTerminal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class LogicLayer extends CapaTerminal<String, List<ArrayList<String>>, String> {

    private Separador separador;
    private Combinador combinador;
    private Alfabetizador alfabetizador;

    public LogicLayer() {
        this.separador = new Separador();
        this.combinador = new Combinador();
        this.alfabetizador = new Alfabetizador();
    }

    @Override
    public void procesarEntradaCapaAnterior(String entradaAnterior) {
        List<String> tokens = separador.separateIntoTokens(entradaAnterior);
        List<ArrayList<String>> statements = combinador.combinateTokens(tokens);
        List<ArrayList<String>> sortedStatements = alfabetizador.sortStatements(statements);

        super.responderACapaAnterior(sortedStatements);
    }

    @Override
    public void procesarRespuestaCapaAnterior(String respuestaAnterior) {
        System.out.println(respuestaAnterior);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicLayer;

import Capas.Capa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class LogicLayer extends Capa<String, List<ArrayList<String>>> {

    private Separador separador;
    private Combinador combinador;
    private Alfabetizador alfabetizador;

    public LogicLayer() {
        this.separador = new Separador();
        this.combinador = new Combinador();
        this.alfabetizador = new Alfabetizador();
    }

    @Override
    protected List<ArrayList<String>> doIt(String statement) {
        List<String> tokens = separador.separateIntoTokens(statement);
        List<ArrayList<String>> statements = combinador.combinateTokens(tokens);
        List<ArrayList<String>> sortedStatements = alfabetizador.sortStatements(statements);

        return sortedStatements;
    }

    @Override
    protected void handleResponse(String ob) {
        System.out.println("Nothing to do here");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Capas.CapaInicial;
import Capas.CapaTerminal;
import InputOutputLayer.InputOutputLayer;
import LogicLayer.LogicLayer;

/**
 *
 * @author Equipo1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CapaInicial inputOutputLayer = new InputOutputLayer();
        CapaTerminal logicLayer = new LogicLayer();
        
        inputOutputLayer.setCapaSiguiente(logicLayer);
        logicLayer.setCapaAnterior(inputOutputLayer);
        
        inputOutputLayer.start();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputLayer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class Salida {
    
    public void printStatements(List<ArrayList<String>> statements) {
        System.out.println("\n-------- Combinaciones --------");
        for(int i = 0; i < statements.size(); i++) {
            String statement = String.join(" ", statements.get(i));
            System.out.println("- " + statement);
        }
    }
    
}

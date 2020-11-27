/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicLayer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class Combinador {
    
    public List<ArrayList<String>> combinateTokens(List<String> tokensList) {
        List<ArrayList<String>> combinatedStatements = new ArrayList<ArrayList<String>>();
        combinatedStatements.add(new ArrayList<String>(tokensList));
        
        List<String> helperArray = new ArrayList<String>(tokensList);
        int corrimientos = tokensList.size() - 1;
        
        for(int i = 0; i < corrimientos; i++) {
            String removedToken = helperArray.remove(0);
            helperArray.add(removedToken);
            
            combinatedStatements.add((ArrayList<String>) helperArray);
            
            helperArray = new ArrayList<String>(helperArray);
        }
        
        return combinatedStatements;
    }
    
}

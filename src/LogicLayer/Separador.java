/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicLayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Equipo1
 */
public class Separador {
    
    public List<String> separateIntoTokens(String statement) {
        List<String> tokensList = Arrays.asList(statement.split(" "));
        return tokensList;
    }
    
}

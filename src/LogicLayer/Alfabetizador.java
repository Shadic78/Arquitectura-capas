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
public class Alfabetizador {

    public List<ArrayList<String>> sortStatements(List<ArrayList<String>> arrayToSort) {
        int length = arrayToSort.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                String statement1 = String.join(" ", arrayToSort.get(j));
                String statement2 = String.join(" ", arrayToSort.get(j + 1));
                if (statement1.toLowerCase()
                        .compareTo(statement2.toLowerCase()) > 0) {
                    ArrayList<String> temp = arrayToSort.remove(j);
                    arrayToSort.add(j + 1, temp);
                }
            }
        }
        return arrayToSort;
    }

}

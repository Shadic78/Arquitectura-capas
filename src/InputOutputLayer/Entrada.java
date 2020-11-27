/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutputLayer;

import java.util.Scanner;

/**
 *
 * @author Equipo1
 */
public class Entrada {
    
    public String getUserInput() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa una cadena: ");
        String statement = input.nextLine();
        
        return statement;
    }
    
}

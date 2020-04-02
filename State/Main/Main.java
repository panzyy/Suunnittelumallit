/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import state.*;

/**
 *
 * @author panzyy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonContext pokemon = new PokemonContext();
        
        for (int i = 0; i < 3; i++){
            pokemon.roar();
        }
    }
    
}

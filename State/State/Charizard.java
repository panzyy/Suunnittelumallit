/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author panzyy
 */
public class Charizard implements PokemonState{
    private PokemonContext pokemon;

    public Charizard(PokemonContext pokemon) {
        this.pokemon = pokemon;
    }



    @Override
    public void evolve() {
        System.out.println("Charizard can't evolve!");
    }

    @Override
    public String roar() {
        return "Charizard!";
    }
    
}

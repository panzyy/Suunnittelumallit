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
public class Charmander implements PokemonState{
    private PokemonContext pokemon;

    public Charmander(PokemonContext pokemon) {
        this.pokemon = pokemon;
    }
    
    
    @Override
    public void evolve() {
        this.pokemon.setState(new Charmeleon(this.pokemon));
    }

    @Override
    public String roar() {
        return "Charmander!";
    }
    
    
}

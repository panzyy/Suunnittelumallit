/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author panzyy
 */
public class Charmeleon implements PokemonState{
    private PokemonContext pokemon;
    //private final int bonus = 6;

    public Charmeleon(PokemonContext pokemon) {
        this.pokemon = pokemon;
    }
    


    @Override
    public void evolve() {
        this.pokemon.setState(new Charizard(this.pokemon));
    }

    @Override
    public String roar() {
        return "Charmeleon!";
    }
    
    //public void addBonus(){
        
    //}
    
    public void accept(PokemonVisitor visitor){
        visitor.visit(this);
    }
    
}

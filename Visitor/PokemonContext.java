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
public class PokemonContext {
    private PokemonState state;

    public PokemonContext() {
        this.state = new Charmander(this);
    }
    
    public void setState(PokemonState newState){
        this.state = newState;
    }
    
    public void roar(){
        System.out.println(this.state.roar());
        this.state.evolve();
    }
    
    public void accept(PokemonVisitor visitor){
        state.accept(visitor);
    }
    
}

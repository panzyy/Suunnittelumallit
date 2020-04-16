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
public interface PokemonState {
    public void evolve();
    public String roar();
    public void accept(PokemonVisitor visitor);
}

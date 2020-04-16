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
public class StateVisitor implements PokemonVisitor{

    @Override
    public void visit(Charmander charmander) {
        System.out.println(charmander.roar());
        charmander.evolve();
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        System.out.println(charmeleon.roar());
        charmeleon.evolve();
    }

    @Override
    public void visit(Charizard charizard) {
        System.out.println(charizard.roar());
        charizard.evolve();
    }
    
}

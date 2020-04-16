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
public interface PokemonVisitor {
    public void visit(Charmander charmander);
    public void visit(Charmeleon charmeleon);
    public void visit(Charizard charizard);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author panzyy
 */
public abstract class Decorator implements Pizza{

    protected Pizza PizzaPohja;
    
    public Decorator(Pizza PizzaPohja) {
        this.PizzaPohja = PizzaPohja;
    }
    
    @Override
    public double getHinta() {
        return this.PizzaPohja.getHinta();
    }

    @Override
    public String getSisalto() {
        return this.PizzaPohja.getSisalto();
    }
    
    
}

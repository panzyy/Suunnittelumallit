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
public class Pinaatti extends Decorator {
    
    public Pinaatti(Pizza PizzaPohja) {
        super(PizzaPohja);
    }
    
    public double getHinta(){
        return this.PizzaPohja.getHinta() + 0.5;
    }
    
    public String getSisalto(){
        return this.PizzaPohja.getSisalto() + ", Pinaatti";
    }
}

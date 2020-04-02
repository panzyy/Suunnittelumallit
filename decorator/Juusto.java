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
public class Juusto extends Decorator {
    
    public Juusto(Pizza PizzaPohja) {
        super(PizzaPohja);
    }
    
    public double getHinta(){
        return super.PizzaPohja.getHinta() + 0.5;
    }
    
    public String getSisalto(){
        return super.PizzaPohja.getSisalto() + ", juusto";
    }
    
}

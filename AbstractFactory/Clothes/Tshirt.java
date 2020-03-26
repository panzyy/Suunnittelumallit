/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clothes;

/**
 *
 * @author panzyy
 */
public class Tshirt extends Clothing{
    
    public Tshirt(String brand) {
        super(brand);
    }
    
    @Override
    public String toString(){
        return "T-paita: " +brand;
    }
}

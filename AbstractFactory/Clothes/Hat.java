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
public class Hat extends Clothing{
    
    public Hat(String brand) {
        super(brand);
    }
    
    @Override
    public String toString(){
        return "Hattu: " +brand;
    }
}

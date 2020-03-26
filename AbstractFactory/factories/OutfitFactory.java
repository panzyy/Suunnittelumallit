/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Clothes.*;

/**
 *
 * @author panzyy
 */
public interface OutfitFactory {
    
    public abstract Clothing createHat();
    public abstract Clothing createJeans();
    public abstract Clothing createShoes();
    public abstract Clothing crateTshirt();
}

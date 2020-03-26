/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import Clothes.Hat;
import Clothes.Jeans;
import Clothes.Shoes;
import Clothes.Tshirt;

/**
 *
 * @author panzyy
 */
public abstract class AbstractOutfitFactory implements OutfitFactory {
    
    private String mBrand;
    
    public AbstractOutfitFactory(String mBrand){
        this.mBrand = mBrand;
    }

    @Override
    public Hat createHat() {
        return new Hat(mBrand);
    }

    @Override
    public Jeans createJeans() {
        return new Jeans(mBrand);
    }

    @Override
    public Shoes createShoes() {
        return new Shoes(mBrand);
    }

    @Override
    public Tshirt crateTshirt() {
        return new Tshirt(mBrand);
    }
    
}

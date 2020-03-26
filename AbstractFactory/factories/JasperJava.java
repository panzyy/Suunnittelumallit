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
public class JasperJava {
    private Clothing hat;
    private Clothing jeans;
    private Clothing shoes;
    private Clothing tshirt;
    
    public void createOutfit(OutfitFactory factory){
        hat = factory.createHat();
        jeans = factory.createJeans();
        shoes = factory.createShoes();
        tshirt = factory.crateTshirt();
    }
    
    public void myOutfit(){
        System.out.println("Minulla on päälläni: \n" +hat+ "\n" + tshirt  + "\n" + jeans+ "\n" +shoes);
    }
}

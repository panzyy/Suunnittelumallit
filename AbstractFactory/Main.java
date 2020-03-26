/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Factories.*;
import Clothes.*;

/**
 *
 * @author panzyy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OutfitFactory factory = new AdidasFactory();
        JasperJava jasper = new JasperJava();
        jasper.createOutfit(factory);
        
        System.out.println("Jasper on insinööri opiskelija...");
        jasper.myOutfit();
        System.out.println(" ");
        
        factory = new BossFactory();
        jasper.createOutfit(factory);
        
        System.out.println("Jasper on juuri valmistunut insinööriksi...");
        jasper.myOutfit();
        
        
    }
    
}

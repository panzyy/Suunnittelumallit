
import Komponentit.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author panzyy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tietokone tietokone = new Tietokone();
        Kotelo kotelo = new Kotelo(30);
        Emolevy emo = new Emolevy(50);
        Verkkokortti vk = new Verkkokortti(10);
        Prosessori pr = new Prosessori(44);
        Naytonohjain no = new Naytonohjain(32);
        Muistipiiri mp = new Muistipiiri(12);
        
        emo.addComponent(vk);
        emo.addComponent(pr);
        emo.addComponent(no);
        emo.addComponent(mp);
        
        kotelo.addComponent(emo);
        
        tietokone.addComponent(kotelo);
        
        System.out.println(emo);
        System.out.println(kotelo);
        
        System.out.println(emo.getComponents());
        System.out.println(kotelo.getComponents());
        tietokone.print();
        
        

    }
    
}

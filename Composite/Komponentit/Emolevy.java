/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponentit;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author panzyy
 */
public class Emolevy extends AbstractComposite{
   
    public Emolevy(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Emolevy: " +this.getPrice()+ 'e';
    }
   

    
}

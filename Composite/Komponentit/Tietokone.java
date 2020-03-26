/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponentit;

import java.util.List;

/**
 *
 * @author panzyy
 */
public class Tietokone extends AbstractComposite{

    public Tietokone(int price) {
        super(price);
    }

    public Tietokone() {
    }

    @Override
    public String toString() {
        return "Tietokone: " +this.getPrice()+ 'e';
    }

   
}

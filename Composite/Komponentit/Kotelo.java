/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponentit;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author panzyy
 */
public class Kotelo extends AbstractComposite{

    public Kotelo(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Kotelo: " +this.getPrice()+ 'e';
    }


    
}

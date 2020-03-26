/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Komponentit;

/**
 *
 * @author panzyy
 */
public class Verkkokortti extends AbstractComponent{

    public Verkkokortti(int price) {
        super(price);
    }

    @Override
    public String toString(){
        return "verkkokortti: " +super.getPrice()+ "e";
    }
    
}

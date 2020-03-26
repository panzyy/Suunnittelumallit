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
public abstract class AbstractComponent implements Component{
    private int price;
    
    public AbstractComponent(int price){
        this.price = price;
    }
    
    public AbstractComponent(){
        
    }
    
    @Override
    public int getPrice(){
        return price;
    }
    
    @Override
    public void setPrice(int Price){
        this.price = Price;
    }
    
    @Override
    public String print(){
        return " " +this;
    }
    
}

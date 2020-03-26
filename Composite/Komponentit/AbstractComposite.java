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
public abstract class AbstractComposite implements Composite{
    
    private List<Component> componentList;
    private int price;
    
    public AbstractComposite(){
        componentList = new ArrayList<>();
    }

    public AbstractComposite(int price) {
        componentList = new ArrayList<>();
        this.price = price;
    }

    @Override
    public boolean addComponent(Component c) {
        if (c == null || componentList.contains(c)){
            return false;
        }
        componentList.add(c);
        return true;
    }
    
    @Override
    public boolean removeComponent(Component c) {
        return componentList.remove(c);
    }

    @Override
    public int ComponentCount() {
        int count = 0;
        for (Component c : componentList){
            count += 1;
        }
        return count;
    }

    @Override
    public List<Component> getComponents() {
        return componentList;
    }

    @Override
    public int getPrice() {
        if (componentList.isEmpty()){
            return price;
        }
        
        int sum = price;
        
        for (Component c : componentList){
            sum += c.getPrice();
        }
        return sum;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String print() {
        String printti = this.toString();
        if (componentList.isEmpty()){
            return this.toString();
        }
        
        for (Component c : componentList){
            printti += c.print();
        }
        return printti;
    }

    
}

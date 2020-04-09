/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author panzyy
 */
public class Customer {
    private ListConverter lc;

    public Customer(ListConverter lc) {
        this.lc = lc;
    }

    public Customer() {
        
    }

    public void setListConverter(ListConverter lc) {
        this.lc = lc;
    }
    
    public <E> String listConverter(List<E> list) {
        return lc.listToString(list);
    }
}

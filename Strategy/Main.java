/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author panzyy
 */
public class Main {
    

    public static void main(String[] args) {
        Customer customer = new Customer();
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        
        for(int i = 0; i < 50; i++) {
            list.add(random.nextInt(300) + 1);
        }
        
        customer.setListConverter(new IteratorConverter());
        System.out.println("Iterator:\n" + customer.listConverter(list));
        
        customer.setListConverter(new ArrayConverter());
        System.out.println("Array:\n" + customer.listConverter(list));
        System.out.println();
        
        customer.setListConverter(new ListGetConverter());
        System.out.println("Get:\n" + customer.listConverter(list));
    }
    
}

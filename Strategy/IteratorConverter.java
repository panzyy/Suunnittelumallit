/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;


import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author panzyy
 */
public class IteratorConverter implements ListConverter{

    @Override
    public <E> String listToString(List<E> list) {
        ListIterator iterator = list.listIterator();
        StringBuilder stringbuilder = new StringBuilder();
        
        while (iterator.hasNext()) {
            stringbuilder.append(iterator.next().toString()).append(", \n");
        }
        return stringbuilder.toString();
    }
    
}

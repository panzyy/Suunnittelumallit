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
public class ArrayConverter implements ListConverter{

    @Override
    public <E> String listToString(List<E> list) {
        Object[] array = list.toArray();
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < array.length ; i++) {
            stringBuilder.append(array[i]).append(", ");
            
            if ((i + 1) % 2 == 0) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
    
}

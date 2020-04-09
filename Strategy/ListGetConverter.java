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
public class ListGetConverter implements ListConverter{

    @Override
    public <E> String listToString(List<E> list) {
        StringBuilder stringBuilder = new StringBuilder();
        
        for (int i = 0; i < list.size(); i++){
            stringBuilder.append(list.get(i)).append(", ");
            
            if ((i + 1) % 3 == 0) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
    
}

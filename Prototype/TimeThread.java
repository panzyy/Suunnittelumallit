/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author panzyy
 */
public class TimeThread implements Runnable{
    private int count;

    @Override
    public void run() {
        Clock clock = new Clock("Real Clock");
        Clock clonedClock = (Clock) clock.clone();
        clonedClock.setClock("Cloned Clock");
        
        while (true){
            System.out.println(clock);
            System.out.println(clonedClock);
            
            clock.addTime();
            //clonedClock.addTime(); Jos käyttää tätä niin molempiin kelloihin lisääntyy aikaa samalla tavalla kuin ylemmässä rivissä.
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(TimeThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(count == 8){
                clock.setHour(5);
                clock.setMinute(12);
                clock.setSecond(44);
            }
            
            count++;
        }
        
    }
    

    
}

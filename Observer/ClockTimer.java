/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author panzyy
 */
public class ClockTimer extends Observable implements Runnable{
    
    private int hours;
    private int minutes;
    private int seconds;
    private boolean running = false;

    public ClockTimer() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public void tick(){
        seconds++;
        if (seconds > 59){
            seconds = 0;
            minutes++;
            if (minutes > 59) {
                minutes = 0;
                hours++;
                
            }
        }
        setChanged();
        
        notifyObservers(new int[]{
            hours, minutes, seconds
        });
    }
    
    @Override
    public void run() {
        running = true;
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
            tick();
        }
    }
    
    public void stop(){
        running = false;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    
    
    
}

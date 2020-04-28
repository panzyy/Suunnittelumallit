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
public class ClockHand implements Prototype{
    private int maxTime;
    private int currTime;

    public ClockHand(int time) {
        this.maxTime = time;
        this.currTime = 0;
    }

    public int getTime() {
        return currTime;
    }
    
    public void setCurTime(int time){
        this.currTime = time;
    }

    public void resetTime(){
        this.currTime = 0;
    }
    
    public boolean addTime(){
        return ++currTime >= maxTime;
    }
    
    @Override
    public Object clone(){
        ClockHand clockhand = null;
        try {
            clockhand = (ClockHand)super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ClockHand.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clockhand;
    }
}

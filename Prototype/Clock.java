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
public class Clock implements Prototype{
    private ClockHand hour, minute, second;
    private String clock;

    public Clock(String clock) {
        this.hour = new ClockHand(24);
        this.minute = new ClockHand(60);
        this.second = new ClockHand(60);
        this.clock = clock;
    }

    public void setHour(int time) {
        this.hour.setCurTime(time);
    }

    public void setMinute(int time) {
        this.minute.setCurTime(time);
    }

    public void setSecond(int time) {
        this.second.setCurTime(time);
    }

    public void setClock(String clock) {
        this.clock = clock;
    }
    
    
    public void addTime(){
        if (second.addTime()){
            second.resetTime();
            if (minute.addTime()){
                minute.resetTime();
                if (hour.addTime()){
                    hour.resetTime();
                }
            }
        }
    }
    
    @Override
    public Object clone(){
        Clock clock = null;
        try {
            clock = (Clock) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clock;
    }
    
    public String toString(){
        return this.clock + "=  " + hour.getTime() + ":" + minute.getTime() + ":" + second.getTime();
    }
    
}

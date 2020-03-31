/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author panzyy
 */
public class DigitalClock implements Observer{
    
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (timer == o){
            draw(arg);
        }
    }
    
    public void draw(Object arg){
        int[] args = (int[]) arg;
        System.out.format("%02d:%02d:%02d\n", args[0], args[1], args[2]);
    }
    
}

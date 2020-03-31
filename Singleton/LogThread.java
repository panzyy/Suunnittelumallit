/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author panzyy
 */
public class LogThread implements Runnable{
    private boolean running = false;
    private String event;
    
    
    public LogThread(String event) {
        this.event = event;
    }

    @Override
    public void run() {
        running = true;
        while (running) {
            try {
                Thread.sleep(500);
                Loggeri.getInstance().log(event + "pyörii...");
            } catch (InterruptedException ex) {
                Logger.getLogger(LogThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void stop(){
        running = false;
    }
    
}

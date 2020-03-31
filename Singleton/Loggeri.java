/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

import java.time.LocalTime;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author panzyy
 */
public class Loggeri {
    
    private PrintWriter writer;
    private static Loggeri INSTANCE;
    
    private Loggeri() {
        try {
            FileWriter filewr = new FileWriter("log.txt");
            writer = new PrintWriter(filewr, true);
        } catch (IOException e) {
        }
    }
    
    public static Loggeri getInstance() {
        if (INSTANCE == null) {
            synchronized (Loggeri.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Loggeri();
                }
            }
        }
        return INSTANCE;
    }
    
    public synchronized void log(String str) {
        writer.println(LocalTime.now() + " [LOG] " + str);
        writer.flush();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author panzyy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "säie";
        
        LogThread[] saikeet = new LogThread[8];
        
        for (int i = 0; i < saikeet.length; i++){
            saikeet[i] = new LogThread(str + " " + i + " ");
            new Thread(saikeet[i]).start();
        }
        

    }
    
}

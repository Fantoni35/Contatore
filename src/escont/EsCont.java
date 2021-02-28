/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escont;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class EsCont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int conteggio=1;
        boolean nome=true;
        Runnable r1= new maThread();
        Thread c1= new Thread(r1);
        Thread c2= new Thread(new maThread());
        Thread c3=new Thread(new maThread());
        
        c1.setPriority(4);
        c2.setPriority(10);
        c3.setPriority(2);
        
        c1.start();
        c2.start();
        c3.start();
        
            Thread.sleep(5000);
          
            
        
         nome=false;
}
        /*Thread.sleep(5000);
        c1.stop();
        c2.stop();
        c3.stop();*/
        
       
    }
    

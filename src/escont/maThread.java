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
public class maThread implements Runnable {
    int conteggio=0;
            boolean nome=true;
            public void maThread(int conteggio,boolean nome){
                this.conteggio=conteggio;
                this.nome=nome;
            }
    public void run(){
         
            
            
            
            /*while(1==1){
            conteggio++;
            }*/
            while(nome==true){
                conteggio++;
            }
            
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Asus pc
 */
public class KeyPress implements KeyListener {
         @Override
        //Called when the key is pressed down.
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_E) {
                Zootopia.setEndworld(true);
                System.exit(0);
            }
            else if(key == KeyEvent.VK_P) {
                Zootopia.setStop(!Zootopia.getStop());
            }
            else if(key == KeyEvent.VK_C) {
                Zootopia.setStop(true);
                Zootopia.getWorld().printExt();
            }
            else if (!Zootopia.getStop() && Zootopia.getbufferDirection() == 'N') {
            if (key == KeyEvent.VK_W) {
              if(Zootopia.getWorld().getDirection() != 'D') {
                Zootopia.setbufferDirection('U');
                Zootopia.getWorld().setDirection('U');
              }
            } else if (key == KeyEvent.VK_A) {
              if(Zootopia.getWorld().getDirection() != 'R') {
                Zootopia.setbufferDirection('L');
                Zootopia.getWorld().setDirection('L');
              }
            } else if (key == KeyEvent.VK_S) {
              if(Zootopia.getWorld().getDirection() != 'U') {
                Zootopia.setbufferDirection('D');
                Zootopia.getWorld().setDirection('D');
              }
            } else if (key == KeyEvent.VK_D) {
              if(Zootopia.getWorld().getDirection() != 'L') {
                Zootopia.setbufferDirection('R');
                Zootopia.getWorld().setDirection('R');
              }
            }
          } 
        }

        @Override
        //Called when the key is released	
        public void keyReleased(KeyEvent e){

        }

        @Override
        //Called when a key is typed
        public void keyTyped(KeyEvent e){

        }
    }

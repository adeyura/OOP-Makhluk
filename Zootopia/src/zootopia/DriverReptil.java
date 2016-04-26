/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cendhika Imantoro / 13514037
 */
public class DriverReptil {
    public static void main(String[] args) {
        int worldSize = 10;


        Reptil K = new Kadal(worldSize);
        Reptil C = new Cicak(worldSize);

        char[][] world = new char [worldSize][worldSize];

        int timeCount = 0;

        while(timeCount < 20) {
            
            for(int i = 0; i < worldSize; i++) {
                for (int j = 0; j < worldSize; j++) {
                    world[i][j] = ' ';
                }
            }
            K.move();
            K.incrTime();
            world[K.getPosisi().getX()][K.getPosisi().getY()] = K.getChar();

            
            C.move();
            C.incrTime();
            world[C.getPosisi().getX()][C.getPosisi().getY()] = C.getChar();

            

            for(int i = 0; i < worldSize +2; i++) {
                System.out.print("-");
            }
            System.out.println();
            for(int i = 0; i < worldSize; i++) {
                System.out.print("|");
                for(int j = 0; j < worldSize; j++) {
                    System.out.print(world[i][j]);
                }
                System.out.println("|");
            }
            for(int i = 0; i < worldSize + 2; i++) {
                System.out.print('-');
            }
            System.out.println();
            timeCount++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(DriverAves.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

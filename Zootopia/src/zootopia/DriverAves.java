package zootopia;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ade Yusuf Rahardian / 13514079
 */
public class DriverAves {
    public static void main(String[] args) {
        int worldSize = 10;



        Aves E = new Elang(worldSize);
        Aves G = new Garuda(worldSize);
        Aves R = new Rajawali(worldSize);
        Aves P = new Pelikan(worldSize);

        char[][] world = new char [worldSize][worldSize];

        int timeCount = 0;

        while(timeCount < 20) {
            
            for(int i = 0; i < worldSize; i++) {
                for (int j = 0; j < worldSize; j++) {
                    world[i][j] = ' ';
                }
            }
            E.move();
            E.incrTime();
            world[E.getPosisi().getX()][E.getPosisi().getY()] = E.getChar();

            
            G.move();
            G.incrTime();
            world[G.getPosisi().getX()][G.getPosisi().getY()] = G.getChar();

            
            R.move();
            R.incrTime();
            world[R.getPosisi().getX()][R.getPosisi().getY()] = R.getChar();

            
            P.move();
            P.incrTime();
            world[P.getPosisi().getX()][P.getPosisi().getY()] = P.getChar();

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

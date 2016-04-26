/*
 * Unit test untuk kelas Amfibia dan kelas turunannya
 */
package zootopia;
import java.util.Random;

/**
 *
 * @author Varian Caesar / 13514041
 * @version 1.0
 */
public class unitAmfibia {
    public static void main(String [] args) throws InterruptedException {
        
        Makhluk.idcounter = 0;
        
        Random rand = new Random();
        int worldSize = 10;
        int i,j;

        int timeCount = 0;

        Amfibia k = new Katak(worldSize);
        Amfibia b = new Belut(worldSize);

        char[][] world = new char[worldSize][worldSize];

        while(timeCount < 20)
        {
            for(i = 0; i < worldSize; i++)
            {
                for(j = 0; j < worldSize; j++)
                {
                    world[i][j] = ' ';
                }
            }

            (k).move();
            (k).incrTime();
            world[(k).getPosisi().getY()][(k).getPosisi().getX()] = (k).getChar();

            (b).move();
            (b).incrTime();
            world[(b).getPosisi().getY()][(b).getPosisi().getX()] = (b).getChar();

            for(i = 0; i < worldSize + 2; i++)
            {
                System.out.print('-');
            }
            System.out.println();
            for(i = 0; i < worldSize; i++)
            {
                System.out.print('|');
                for(j = 0; j < worldSize; j++)
                {
                    System.out.print(world[i][j]);
                }
                System.out.println('|');
            }
            for(i = 0; i < worldSize + 2; i++)
            {
                System.out.print('-');
            }
            System.out.println();

            timeCount++;
            Thread.sleep(500);
        }
    }
}

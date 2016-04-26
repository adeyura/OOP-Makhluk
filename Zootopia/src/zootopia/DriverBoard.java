package zootopia;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ade Yusuf Rahardian / 13514079
 */
public class DriverBoard {
    public static void main (String[] args) {
        int size = 20;
        Board B = new Board(size);
        Point P = new Point();
        int temp;
        char c =' ';
        
        Random randomGenerator = new Random();
        
        B.reset();
        B.print();
        System.out.println();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j< size; j++) {
                temp = randomGenerator.nextInt(4);
                P.setX(i);
                P.setY(j);
                
                if(temp == 0) {
                    c = ' ';
                }
                else if (temp == 1) {
                    c = 'A';
                }
                else if (temp == 2) {
                    c = 'B';
                }
                else if (temp == 3) {
                    c = 'C';
                }
                
                B.setElmt(P, c);
                
            }
        }
        
        for(int i = size-1; i>=0; i--) {
            for(int j = 0; j< size; j++) {
                P.setX(j);
                P.setY(i);
                
                System.out.println(B.getElmt(P));
            }
            System.out.println();
        }
        System.out.println();  
        
        B.print();
        try {
            B.printExt();
        } catch (IOException ex) {
            Logger.getLogger(DriverBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println();

        B.reset();
        B.print();
        System.out.println();
    }
    
}

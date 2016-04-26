package zootopia;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
/**
 * Main Program Aplikasi.
 * @author Varian Caesar / 13514041
 * @version 1.0
 */

public class Main {
  // global variables
  private static boolean endworld;
  private static int worldSize;
  private static final int DELTA_TIME = 500;
  private static World w;
  private static char bufferDirection = 'N';
  private static boolean stop;
  private static int wait;

  static class ExecuteInput extends Thread {
    private char cc;
    private Thread t;

    @Override
    public void run() {
      while (!endworld) {
        try {
          cc = (char) System.in.read();
        } catch (IOException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (cc == 'e') {
          endworld = true;
        } else if (cc == 'p') {
          stop = !stop;
        } else if (cc == 'c') {
          stop = true;
          w.printExt();
        }
        else if (!stop && bufferDirection == 'N') {
          if (cc == 'w') {
            if(w.getDirection() != 'D') {
              bufferDirection = 'U';
              w.setDirection('U');
            }
          } else if (cc == 'a') {
            if(w.getDirection() != 'R') {
              bufferDirection = 'L';
              w.setDirection('L');
            }
          } else if (cc == 's') {
            if(w.getDirection() != 'U') {
              bufferDirection = 'D';
              w.setDirection('D');
            }
          } else if (cc == 'd') {
            if(w.getDirection() != 'L') {
              bufferDirection = 'R';
              w.setDirection('R');
            }
          }
        } 
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    //inisialisasi variabel global
    //algoritma
    int i, j;
    int check;
    Scanner input = new Scanner(System.in);
    System.out.println("======================================================================");
    System.out.println("                                                                      ");
    System.out.println("        HHHHHHH   HHHHH  HHHHH HHHHHH  HHHHH HHHHH  HHH  HHH          ");
    System.out.println("            HH   HH  HH HH  HH   HH   HH  HH HH  HH HH  HH HH         ");
    System.out.println("          HHH    H    H H    H   HH   H    H HHHHH  H  HH   HH        ");
    System.out.println("         HH      HH  HH HH  HH   HH   HH  HH HH    HH  HHHHHHH        ");
    System.out.println("        HHHHHHH  HHHHH  HHHHH    HH   HHHHH  H    HHH  HH   HH        ");
    System.out.println("                                                                      ");
    System.out.println("======================================================================");
    System.out.println();

    do {
      System.out.println("Masukkan ukuran dunia (int >= 3) : ");
      check = input.nextInt();
      if (check < 3) {
        System.out.println("Masukkan salah, Ulangi !");
      }
    } while (check < 3);
    worldSize = check;
    w = new World(worldSize);
    endworld = false;
    stop = false;
    while (w.getNbMakhluk() < worldSize*worldSize/50 || w.getNbMakhluk() < 3) {
      w.createMakhluk();
    }
    ExecuteInput e1 = new ExecuteInput();
    e1.start();
    while (!endworld) {
      w.update();
      bufferDirection = 'N';
      try {
        Thread.sleep(DELTA_TIME);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }
      
      while (stop && !endworld) {

      }
      
      if (!endworld) {
        endworld = w.getGameOverStatus();
      }
    }
    System.out.println("GAME OVER!");
  }
}

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
  private static final int RATIO_MAKHLUK = 3;
  private static boolean endworld;
  private static final int SCREEN_SIZE = 20;
  private static int worldSize;
  private static int startMakhluk;
  private static final int DELTA_TIME = 500;
  private static World w;
  private static boolean stop;
  private static boolean frameByFrame;
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
          if (!stop) {
            stop = true;
          } else if (!frameByFrame) {
            stop = false;
          }
        } else if (cc == 'n') {
          if (frameByFrame) {
            stop = false;
          }
        } else if (cc == 's') {
          if (!endworld) {
            w.createMakhluk();
          }
        } else if (cc == 'f') {
          if (!frameByFrame) {
            frameByFrame = true;
            wait = 0;
          } else {
            frameByFrame = false;
            wait = DELTA_TIME;
            stop = false;
          }
        } else if (cc == 'c') {
          stop = true;
          w.printExt();
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
      System.out.println("Masukkan ukuran dunia (int > 1) : ");
      check = input.nextInt();
      if (check <= 1) {
        System.out.println("Masukkan salah, Ulangi !");
      }
    } while (check <= 1);

    worldSize = check;
    startMakhluk = worldSize * worldSize / RATIO_MAKHLUK;
    w = new World(worldSize);
    endworld = false;
    stop = false;
    frameByFrame = false;
    wait = DELTA_TIME;

    for (i = 0; i < startMakhluk; i++) {
      w.createMakhluk();
    }
    ExecuteInput e1 = new ExecuteInput();
    e1.start();
    while (!endworld) {

      for (i = 0; i < w.getNbMakhluk(); i++) {
        w.getList().get(i).incrTime();
        w.getList().get(i).move();
      }

      w.update();
      try {
        Thread.sleep(wait);
      } catch (InterruptedException ex) {
        Thread.currentThread().interrupt();
      }

      if (frameByFrame) {
        stop = true;
      }
      while (stop && !endworld) {

      }
      if (w.getNbMakhluk() <= 1) {
        endworld = true;
        for (i = 0; i < SCREEN_SIZE; i++) {
          System.out.println();
        }

        for (i = 0; i < worldSize + 2; i++) {
          System.out.print('-');
        }
        System.out.println();
        for (i = 0; i < worldSize; i++) {
          System.out.print('|');
          for (j = 0; j < worldSize; j++) {
            System.out.print(' ');
          }
          System.out.println('|');
        }
        for (i = 0; i < worldSize + 2; i++) {
          System.out.print('-');
        }
        System.out.println();
        try {
          Thread.sleep(wait);
        } catch (InterruptedException ex) {
          Thread.currentThread().interrupt();
        }
        System.out.println("Press any key to exit");
      }
    }
  }
}

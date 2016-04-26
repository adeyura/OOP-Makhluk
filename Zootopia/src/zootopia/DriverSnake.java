/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;
import java.util.Scanner;

/**
 *
 * @author ASUS-A451LB
 */
public class DriverSnake {
    
    private static final char UP = 'U';
    private static final char RIGHT = 'R';
    private static final char DOWN = 'D';
    private static final char LEFT = 'L';
    private static final char NULL = 'N';
    
    public static void main(String[] args) {
    char[][] view;
    Snake S;
    Snake.SnakeBody iterator;
    int size;
    char input = 'q';
    Scanner s = new Scanner(System.in);

    do {
      if (input == 'b') {
        System.out.println("1 petak dunia : 3x3");
        System.out.print("Masukkan ukuran dunia : ");
        size = s.nextInt();
        System.out.println("Ukuran dunia " + 3*size + "x" + 3*size);
        view = new char[3 * size][3 * size];
        S = new Snake(size);
        do {
          for (int i = 0; i < 3 * size; i++) {
            for (int j = 0; j < 3 * size; j++) {
              view[i][j] = ' ';
            }
          }
          iterator = S.getTail();
          int count = 0;
          while (iterator != null) {
            view[iterator.getPos().getX() * 3 + 1][iterator.getPos().getY() * 3+ 1] = 'O';
            if (iterator.getFrom() == UP || iterator.getTo() == UP) {
              view[iterator.getPos().getX() * 3 + 1][iterator.getPos().getY() * 3] = 'O';
            }
            if (iterator.getFrom() == DOWN || iterator.getTo() == DOWN) {
              view[iterator.getPos().getX() * 3 + 1][iterator.getPos().getY() * 3 + 2] = 'O';
            }
            if (iterator.getFrom() == LEFT || iterator.getTo() == LEFT) {
              view[iterator.getPos().getX() * 3][iterator.getPos().getY() * 3 + 1] = 'O';
            }
            if (iterator.getFrom() == RIGHT || iterator.getTo() == RIGHT) {
              view[iterator.getPos().getX() * 3 + 2][iterator.getPos().getY() * 3 + 1] = 'O';
            }
            iterator = iterator.getNext();
            count++;
            System.out.println(count);
          }
          for (int i = 0; i < size * 3 + 2; i++) {
            System.out.print('-');
          }
          System.out.println();
          for (int i = 0; i < 3 * size; i++) {
            System.out.print('|');
            for (int j = 0; j < 3 * size; j++) {
              System.out.print(view[j][i]);
            }
            System.out.println('|');
          }
          for (int i = 0; i < size * 3 + 2; i++) {
            System.out.print('-');
          }
          System.out.println();

          System.out.println("w-a-s-d : change direction");
          System.out.println("n       : next position");
          System.out.println("e       : eat");
          System.out.println("q       : quit");
          input = s.next().charAt(0);
          if (input == 'n') {
            S.move();
          } else if (input == 'e') {
            S.eat();
          } else if (input == 'w' && S.getDirection() != DOWN) {
            S.setDirection(UP);
          } else if (input == 'a' && S.getDirection() != RIGHT) {
            S.setDirection(LEFT);
          } else if (input == 's' && S.getDirection() != UP) {
            S.setDirection(DOWN);
          } else if (input == 'd' && S.getDirection() != LEFT) {
            S.setDirection(RIGHT);
          }
        } while (input != 'q');
      }
      System.out.println("q : quit");
      System.out.println("b : begin");
      input = s.next().charAt(0);
    } while (input != 'q');
  }
}

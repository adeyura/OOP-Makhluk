package zootopia;
import java.util.Random;

/**
 * Merupakan kelas hewan yang termasuk golongan Reptil.
 * Hewan - hewan yang termasuk Reptil yaitu Cicak dan Kadal.
 * @author Cendhika Imantoro / 13514037
 * @version 1.0
 */

abstract class Reptil extends Makhluk {

  /**
  * Atribut Protected arah gerak Makhluk.
  */
  private int arah;

  /**
  * Atribut Protected sumbu, Makhluk bergerak pada sumbu x atau y.
  */
  private final char sumbu;


  /**
  * ctor kelas Reptil, melakukan random pada arah gerak dan sumbu gerak.
  * Makhluk yang merupakan turunan kelas Reptil.
  */
  Reptil() {
    Random randomGenerator = new Random();
    int temp;
    //random arah hadap makhluk
    arah = randomGenerator.nextInt(2);
    //random arah gerak makhluk
    temp = randomGenerator.nextInt(2);
    if (temp == 0) {
      sumbu = 'X';
    } else {
      sumbu = 'Y';
    }
  }

  /**
  * Method over-ride dari method move pada kelas Makhluk.
  * Method move akan membuat Makhluk begerak pada board.
  */
  @Override
  public void move() {
    int x, y;

    x = getPosisi().getX();
    y = getPosisi().getY();

    if (getWaktu() % getDeltaTime() == 0) {
      if (sumbu == 'X') {
        if (x == getWorldSize() - 1) {
          arah = 1;
        } else if (x == 0) {
          arah = 0;
        }
        if (arah == 0) {
          x = x + 1;
        } else {
          x = x - 1;
        }
      } else {
        if (y == getWorldSize() - 1) {
          arah = 1;
        } else if (y == 0) {
          arah = 0;
        }
        if (arah == 0) {
          y = y + 1;
        } else {
          y = y - 1;
        }
      }
    }
    setPX(x);
    setPY(y);
  }
}
package zootopia;
import java.util.Random;

/**
 * Merupakan kelas hewan yang termasuk golongan Amfibia.
 * Hewan - hewan yang termasuk Amfibia yaitu Katak dan Belut.
 * @author Varian Caesar / 13514041
 * @author Yusak Yuwono Awondatu / 13514005
 * @version 1.0
 */
abstract class Amfibia extends Makhluk {

  /**
   * Atribut Protected arah.
   */
  private int arah;

  /**
   * Konstanta banyak arah yang mungkin.
   */
  private static final int N_ARAH = 8;

  /**
   * Konstanta arah atas-kanan.
   */
  private static final int VAL_UP_RIGHT = 0;

  /**
   * Konstanta arah kanan.
   */
  private static final int VAL_RIGHT = 1;

  /**
   * Konstanta arah bawah-kanan.
   */
  private static final int VAL_DOWN_RIGHT = 2;

  /**
   * Konstanta arah bawah.
   */
  private static final int VAL_DOWN = 3;

  /**
   * Konstanta arah bawah-kiri.
   */
  private static final int VAL_DOWN_LEFT = 4;

  /**
   * Konstanta arah kiri.
   */
  private static final int VAL_LEFT = 5;

  /**
   * Konstanta arah atas-kiri.
   */
  private static final int VAL_UP_LEFT = 6;

  /**
   * Konstanta arah atas.
   */
  private static final int VAL_UP = 7;

  /**
   * ctor kelas Amfibia, melakukan random arah gerak hewan kelas Amfibia.
   */
  Amfibia() {
    Random randomGenerator;
    randomGenerator = new Random();
    arah = randomGenerator.nextInt(N_ARAH);
  }

  /**
   * Method over-ride dari method move pada kelas Makhluk.
   * Method move akan membuat Makhluk begerak pada board.
   * @see Makhluk
   */
  @Override
  public void move() {
    int nextMove, x, y;
    if (waktu % deltatime == 0) {
      Random randomGenerator;
      randomGenerator = new Random();
      if (p.getX() == 0 || p.getY() == 0 || p.getX() == worldSize - 1
                                                 || p.getY() == worldSize - 1) {
        do {
          nextMove = randomGenerator.nextInt(N_ARAH);
        } while (((p.getX() == 0)
                  && (nextMove <= VAL_UP_LEFT && nextMove >= VAL_DOWN_LEFT))
            || (((p.getY()) == 0)
                  && (nextMove <= VAL_DOWN_LEFT && nextMove >= VAL_DOWN_RIGHT))
            || ((p.getX() == worldSize - 1)
                  && (nextMove <= VAL_DOWN_RIGHT && nextMove >= VAL_UP_RIGHT))
            || ((p.getY() == worldSize - 1)
                  && (nextMove <= VAL_UP_RIGHT || nextMove >= VAL_UP_LEFT)));
        arah = nextMove;
      }
      x = p.getX();
      y = p.getY();
      if (arah <= VAL_UP_LEFT && arah >= VAL_DOWN_LEFT) {
        x = p.getX() - 1;
      }
      if (arah <= VAL_DOWN_RIGHT && arah >= VAL_UP_RIGHT) {
        x = p.getX() + 1;
      }
      if (arah <= VAL_DOWN_LEFT && arah >= VAL_DOWN_RIGHT) {
        y = p.getY() - 1;
      }
      if (arah <= VAL_UP_RIGHT || arah >= VAL_UP_LEFT) {
        y = p.getY() + 1;
      }
      p.setX(x);
      p.setY(y);
    }
  }
}

package zootopia;
import java.util.Random;
/**
 * Merupakan kelas hewan yang termasuk golongan Aves.
 * Hewan - hewan yang termasuk Aves yaitu Elang, Rajawali, Garuda dan Pelikan.
 * @author Ade Yusuf Rahardian / 13514079
 * @version 1.0
 */
public abstract class Aves extends Makhluk {

  /**
  * Konstanta batasan nilai random.
  */
  private static final int N_RAND = 3;

  /** Method over-ride dari method move pada kelas Makhluk.
  *  Method move akan membuat Makhluk begerak pada board.
  */
  @Override
  public final void move() {
    int x = p.getX();
    int y = p.getY();
    int dx = 0, dy = 0;

    if (waktu % deltatime == 0) {
      do {
        do {
          Random randomGenerator = new Random();
          dx = randomGenerator.nextInt(N_RAND) - 1;
          dy = randomGenerator.nextInt(N_RAND) - 1;
        } while (dx == 0 && dy == 0);
      } while (x + dx < 0 || x + dx > worldSize - 1
                || y + dy < 0 || y + dy > worldSize - 1);
    }
    p.setX(x + dx);
    p.setY(y + dy);
  }
}

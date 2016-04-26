package zootopia;
import java.util.Random;

/**
 * Implementasi kelas hewan Rajawali yang merupakan turunan dari kelas Aves.
 * @author Ade Yusuf Rahardian \ 13514079
 * @version 1.0
 */
public class Rajawali extends Aves {

  /**
  * Konstanta kekuatan kelas Rajawali.
  */
  private static final int KEKUATAN = 4;

  /**
  * Konstanta karakter kelas Rajawali.
  */
  private static final char CHAR = '#';

  /**
  * Konstanta deltatime kelas Rajawali.
  */
  private static final int DELTA = 5;

  /**
  * Merupakan ctor dari kelas Rajawali.
  * @param worldSize
  */
  public Rajawali(final int worldSize) {
    Random rand = new Random();
    id = idcounter;
    idcounter++;
    kekuatan = KEKUATAN;
    c = CHAR;
    deltatime = DELTA;
    this.worldSize = worldSize;
    p.setX(rand.nextInt(worldSize));
    p.setY(rand.nextInt(worldSize));
    waktu = rand.nextInt(deltatime);
  }

  /**
  * Getter kekuatan makhluk.
  * @return kekuatan
  */
  @Override
  public final int getKekuatan() {
    return kekuatan;
  }

  /**
  * Getter char makhluk.
  * @return c
  */
  @Override
  public final char getChar() {
    return c;
  }

  /**
  * Getter posisi makhluk dalam kordinat Point.
  * @return p
  */
  @Override
  public final Point getPosisi() {
    return p;
  }

  /**
  * Getter id setiap makhluk.
  * @return id
  */
  @Override
  public final int getID() {
    return id;
  }

  /**
  * Prosedur untuk men-increment nilai waktu dunia.
  */
  @Override
  public final void incrTime() {
    waktu++;
  }
}

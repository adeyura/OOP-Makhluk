package zootopia;
import java.util.Random;

/**
 * Implementasi kelas hewan Garuda yang merupakan turunan dari kelas Aves.
 * @author Ade Yusuf Rahardian
 * @version 1.0
 */
public class Garuda extends Aves {

  /**
  * Konstanta kekuatan kelas Garuda.
  */
  private static final int KEKUATAN = 7;

  /**
  * Konstanta karakter kelas Garuda.
  */
  private static final char CHAR = '@';

  /**
  * Konstanta deltatime kelas Garuda.
  */
  private static final int DELTA = 4;

  /**
  * Merupakan ctor dari kelas Garuda.
  * @param worldSize
  */
  public Garuda(final int worldSize) {
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

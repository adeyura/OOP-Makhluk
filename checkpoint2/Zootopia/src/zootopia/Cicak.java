package zootopia;
import java.util.Random;
/**
 * Implementasi kelas hewan Cicak yang merupakan turunan dari kelas Reptil.
 * @author Cendhika Imantoro / 13514037
 * @version 1.0
 */

public class Cicak extends Reptil {

  /**
  * Konstanta kekuatan kelas Cicak.
  */
  private static final int KEKUATAN = 2;

  /**
  * Konstanta karakter kelas Cicak.
  */
  private static final char CHAR = '%';

  /**
  * Konstanta deltatime kelas Cicak.
  */
  private static final int DELTA = 2;

  /**
  * Merupakan ctor dari kelas Cicak.
  * @param worldSize
  */
  public Cicak(final int worldSize) {
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

package zootopia;
import java.util.Random;

/**
 * Implementasi kelas hewan Belut yang merupakan turunan dari kelas Amfibia.
 * @author Varian Caesar / 13514041
 * @version 1.0
 */

public class Belut extends Amfibia {

  /**
  * Konstanta kekuatan kelas Belut.
  */
  private static final int KEKUATAN = 6;

  /**
  * Konstanta karakter kelas Belut.
  */
  private static final char CHAR = '&';

  /**
  * Konstanta deltatime kelas Belut.
  */
  private static final int DELTA = 1;

  /**
  * Merupakan ctor dari kelas Belut.
  * @param worldSize
  */
  public Belut(final int worldSize) {
    Random rand = new Random();
    setID(getIDCounter());
    setIDCounter(getIDCounter()+1);
    setKekuatan(KEKUATAN);
    setChar(CHAR);
    setDeltaTime(DELTA);
    setWorldSize(worldSize);
    setPX(rand.nextInt(worldSize));
    setPY(rand.nextInt(worldSize));
    setWaktu(rand.nextInt(getDeltaTime()));
  }
}

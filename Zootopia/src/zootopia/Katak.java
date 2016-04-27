package zootopia;
import java.util.Random;

/**
 * Implementasi kelas hewan Katak yang merupakan turunan kelas Amfibia
 * @author Varian Caesar / 13514041
 * @version 1.0
 */

public class Katak extends Amfibia {

  /**
  * Konstanta kekuatan kelas Katak.
  */
  private static final int KEKUATAN = 3;

  /**
  * Konstanta karakter kelas Katak.
  */
  private static final char CHAR = '*';

  /**
  * Konstanta deltatime kelas Katak.
  */
  private static final int DELTA = 7;

  /**
  * Merupakan ctor dari kelas Katak.
  * @param worldSize
  */
  public Katak(final int worldSize) {
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

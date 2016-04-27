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

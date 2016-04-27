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

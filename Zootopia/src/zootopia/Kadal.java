package zootopia;
import java.util.Random;

/**
 * Implementasi kelas hewan Kadal yang merupakan turunan dari kelas Reptil.
 * @author Cendhika Imantoro / 13514037
 * @version 1.0
 */

public class Kadal extends Reptil {

  /**
  * Konstanta kekuatan kelas Kadal.
  */
  private static final int KEKUATAN = 4;

  /**
  * Konstanta karakter kelas Kadal.
  */
  private static final char CHAR = '^';

  /**
  * Konstanta deltatime kelas Kadal.
  */
  private static final int DELTA = 3;

  /**
  * Merupakan ctor dari kelas Kadal.
  * @param worldSize
  */
  public Kadal(final int worldSize) {
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

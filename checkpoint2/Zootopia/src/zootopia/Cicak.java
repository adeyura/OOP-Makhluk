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

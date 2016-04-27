package zootopia;
import java.util.Random;

/**
 * Implementasi kelas hewan Pelikan yang merupakan turunan dari kelas Aves.
 * @author Ade Yusuf Rahardian / 13514079
 * @version 1.0
 */

public class Pelikan extends Aves {

  /**
  * Konstanta kekuatan kelas Pelikan.
  */
  private static final int KEKUATAN = 3;

  /**
  * Konstanta karakter kelas Pelikan.
  */
  private static final char CHAR = '$';

  /**
  * Konstanta deltatime kelas Pelikan.
  */
  private static final int DELTA = 5;

  /**
  * Merupakan ctor dari kelas Pelikan.
  * @param worldSize
  */
  public Pelikan(final int worldSize) {
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

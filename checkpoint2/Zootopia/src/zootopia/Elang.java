package zootopia;
import java.util.Random;

/**
 * Implementasi kelas hewan Elang yang merupakan turunan dari kelas Aves.
 * @author Ade Yusuf Rahardian / 13514079
 * @version 1.0
 */

public class Elang extends Aves {

  /**
  * Konstanta kekuatan kelas Elang.
  */
  private static final int KEKUATAN = 6;

  /**
  * Konstanta karakter kelas Elang.
  */
  private static final char CHAR = '!';

  /**
  * Konstanta deltatime kelas Elang.
  */
  private static final int DELTA = 3;

  /**
  * Merupakan ctor dari kelas Elang.
  * @param worldSize
  */
  public Elang(final int worldSize) {
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

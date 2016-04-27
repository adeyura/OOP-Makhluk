package zootopia;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cendhika Imantoro / 13514037
 */
public class KadalTest {
  
  public KadalTest() {
  }

  /**
   * Test of getKekuatan method, of class Kadal.
   */
  @Test
  public void testGetKekuatan() {
    System.out.println("getKekuatan");
    Kadal instance = new Kadal(10);
    int expResult = 4;
    int result = instance.getKekuatan();
    assertEquals(expResult, result);
  }

  /**
   * Test of getChar method, of class Kadal.
   */
  @Test
  public void testGetChar() {
    System.out.println("getChar");
    Kadal instance = new Kadal(10);
    char expResult = '^';
    char result = instance.getChar();
    assertEquals(expResult, result);
  }

  /**
   * Test of getPosisi method, of class Kadal.
   */
  @Test
  public void testGetPosisi() {
    System.out.println("getPosisi");
    int size = 10;
    Kadal instance = new Kadal(size);
    Point result = instance.getPosisi();
    assertTrue(result.compareTo(new Point(0,0)) >= 0 && result.compareTo(new Point(size,size)) < 0);
  }

  /**
   * Test of getID method, of class Kadal.
   */
  @Test
  public void testGetID() {
    System.out.println("getID");
    int size = 10;
    Kadal instance = new Kadal(size);
    int result = instance.getID();
    assertTrue(result >= 0);
  }

  /**
   * Test of incrTime method, of class Kadal.
   */
  @Test
  public void testIncrTime() {
    System.out.println("incrTime");
    Kadal instance = new Kadal(10);
    instance.incrTime();
  }
}

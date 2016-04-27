package zootopia;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cendhika Imantoro / 13514037
 */
public class CicakTest {
  
  public CicakTest() {
  }
  /**
   * Test of getKekuatan method, of class Cicak.
   */
  @Test
  public void testGetKekuatan() {
    System.out.println("getKekuatan");
    Cicak instance = new Cicak(10);
    int expResult = 2;
    int result = instance.getKekuatan();
    assertEquals(expResult, result);
  }

  /**
   * Test of getChar method, of class Cicak.
   */
  @Test
  public void testGetChar() {
    System.out.println("getChar");
    Cicak instance = new Cicak(10);
    char expResult = '%';
    char result = instance.getChar();
    assertEquals(expResult, result);
  }

  /**
   * Test of getPosisi method, of class Cicak.
   */
  @Test
  public void testGetPosisi() {
    System.out.println("getPosisi");
    int size = 10;
    Cicak instance = new Cicak(size);
//        Point expResult = null;
    Point result = instance.getPosisi();
    assertTrue(result.compareTo(new Point(0,0)) >= 0 && result.compareTo(new Point(size,size)) < 0);
  }

  /**
   * Test of getID method, of class Cicak.
   */
  @Test
  public void testGetID() {
    System.out.println("getID");
    int size = 10;
    Cicak instance = new Cicak(size);
    int result = instance.getID();
    assertTrue(result >= 0);
  }

  /**
   * Test of incrTime method, of class Cicak.
   */
  @Test
  public void testIncrTime() {
    System.out.println("incrTime");
    Cicak instance = new Cicak(10);
    instance.incrTime();
  }
  
}

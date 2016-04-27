package zootopia;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cendhika Imantoro / 13514037
 */
public class PointTest {
  
  public PointTest() {
  }
  
  /**
   * Test of getX method, of class Point.
   */
  @Test
  public void testGetX() {
    System.out.println("getX");
    Point instance = new Point(1,2);
    int expResult = 1;
    int result = instance.getX();
    assertEquals(expResult, result);
  }

  /**
   * Test of getY method, of class Point.
   */
  @Test
  public void testGetY() {
    System.out.println("getY");
    Point instance = new Point(1,2);
    int expResult = 2;
    int result = instance.getY();
    assertEquals(expResult, result);
  }

  /**
   * Test of setX method, of class Point.
   */
  @Test
  public void testSetX() {
    System.out.println("setX");
    int n = 0;
    Point instance = new Point();
    instance.setX(n);
  }

  /**
   * Test of setY method, of class Point.
   */
  @Test
  public void testSetY() {
    System.out.println("setY");
    int n = 0;
    Point instance = new Point();
    instance.setY(n);
  }

  /**
   * Test of compareTo method, of class Point.
   */
  @Test
  public void testCompareTo() {
    System.out.println("compareTo");
    Point p = new Point(0,1);
    Point instance = new Point(0,0);
    int expResult = -1;
    int result = instance.compareTo(p);
    assertEquals(expResult, result);
  }

  /**
   * Test of equals method, of class Point.
   */
  @Test
  public void testEquals() {
    System.out.println("equals");
    Object o = null;
    Point instance = new Point();
    boolean expResult = false;
    boolean result = instance.equals(o);
    assertEquals(expResult, result);
  }

  /**
   * Test of hashCode method, of class Point.
   */
  @Test
  public void testHashCode() {
    System.out.println("hashCode");
    Point instance = new Point();
    int expResult = 0;
    int result = instance.hashCode();
    assertEquals(expResult, result);
  }
  
}

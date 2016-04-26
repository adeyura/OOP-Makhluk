package zootopia;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Varian Caesar / 13514041
 */
public class BelutTest {
    

    /**
     * Test of getKekuatan method, of class Belut.
     */
    @Test
    public void testGetKekuatan() {
        int size = 10;
        System.out.println("getKekuatan");
        Belut instance = new Belut(size);
        int expResult = 6;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getChar method, of class Belut.
     */
    @Test
    public void testGetChar() {
        System.out.println("getChar");
        int size = 10;
        Belut instance = new Belut(size);
        char expResult = '&';
        char result = instance.getChar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosisi method, of class Belut.
     */
    @Test
    public void testGetPosisi() {
        System.out.println("getPosisi");
        int size = 10;
        Belut instance = new Belut(size);
        Point result = instance.getPosisi();
        assertTrue(result.compareTo(new Point(0,0)) >= 0 && result.compareTo(new Point(size,size)) < 0);
    }

    /**
     * Test of getID method, of class Belut.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        int size = 10;
        Belut instance = new Belut(size);
        int result = instance.getID();
        assertTrue(result >= 0);
    }

    /**
     * Test of incrTime method, of class Belut.
     */
    @Test
    public void testIncrTime() {
        System.out.println("incrTime");
        int size = 10;
        Belut instance = new Belut(size);
        instance.incrTime();
    }
    
}

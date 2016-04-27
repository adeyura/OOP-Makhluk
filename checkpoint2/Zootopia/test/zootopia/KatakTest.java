package zootopia;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Varian Caesar / 13514041
 */
public class KatakTest {


    /**
     * Test of getKekuatan method, of class Katak.
     */
    @Test
    public void testGetKekuatan() {
        int size = 10;
        System.out.println("getKekuatan");
        Katak instance = new Katak(size);
        int expResult = 3;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getChar method, of class Katak.
     */
    @Test
    public void testGetChar() {
        System.out.println("getChar");
        int size = 10;
        Katak instance = new Katak(size);
        char expResult = '*';
        char result = instance.getChar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosisi method, of class Katak.
     */
    @Test
    public void testGetPosisi() {
        System.out.println("getPosisi");
        int size = 10;
        Katak instance = new Katak(size);
        Point result = instance.getPosisi();
        assertTrue(result.compareTo(new Point(0,0)) >= 0 && result.compareTo(new Point(size,size)) < 0);
    }

    /**
     * Test of getID method, of class Katak.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        int size = 10;
        Katak instance = new Katak(size);
        int result = instance.getID();
        assertTrue(result >= 0);
    }

    /**
     * Test of incrTime method, of class Katak.
     */
    @Test
    public void testIncrTime() {
        System.out.println("incrTime");
        int size = 10;
        Katak instance = new Katak(size);
        instance.incrTime();
    }
    
}

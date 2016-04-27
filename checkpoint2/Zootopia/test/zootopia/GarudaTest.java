package zootopia;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ade Yusuf Rahardian / 13514079
 */
public class GarudaTest {
    
    /**
     * Test of getKekuatan method, of class Garuda.
     */
    @Test
    public void testGetKekuatan() {
        int size = 10;
        System.out.println("getKekuatan");
        Garuda instance = new Garuda(size);
        int expResult = 7;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getChar method, of class Garuda.
     */
    @Test
    public void testGetChar() {
        System.out.println("getChar");
        Garuda instance = new Garuda(10);
        char expResult = '@';
        char result = instance.getChar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosisi method, of class Garuda.
     */
    @Test
    public void testGetPosisi() {
        System.out.println("getPosisi");
        int size = 10;
        Garuda instance = new Garuda(size);
        Point result = instance.getPosisi();
        assertTrue(result.compareTo(new Point(0,0)) >= 0 && result.compareTo(new Point(size,size)) < 0);
    }

    /**
     * Test of getID method, of class Garuda.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        int size = 10;
        Elang instance = new Elang(size);
        int result = instance.getID();
        assertTrue(result >= 0);
    }

    /**
     * Test of incrTime method, of class Garuda.
     */
    @Test
    public void testIncrTime() {
        System.out.println("incrTime");
        int size = 10;
        Garuda instance = new Garuda(size);
        instance.incrTime();
    }
    
}

package zootopia;


import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ade Yusuf Rahardian / 13514079
 */
public class ElangTest {

    /**
     * Test of getKekuatan method, of class Elang.
     */
    @Test
    public void testGetKekuatan() {
        int size = 10;
        System.out.println("getKekuatan");
        Elang instance = new Elang(size);
        int expResult = 6;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getChar method, of class Elang.
     */
    @Test
    public void testGetChar() {
        System.out.println("getChar");
        int size = 10;
        Elang instance = new Elang(size);
        char expResult = '!';
        char result = instance.getChar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosisi method, of class Elang.
     */
    @Test
    public void testGetPosisi() {
        System.out.println("getPosisi");
        int size = 10;
        Elang instance = new Elang(size);
        Point result = instance.getPosisi();
        assertTrue(result.compareTo(new Point(0,0)) >= 0 && result.compareTo(new Point(size,size)) < 0);
    }

    /**
     * Test of getID method, of class Elang.
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
     * Test of incrTime method, of class Elang.
     */
    @Test
    public void testIncrTime() {
        System.out.println("incrTime");
        int size = 10;
        Elang instance = new Elang(size);
        instance.incrTime();
    }
    
}

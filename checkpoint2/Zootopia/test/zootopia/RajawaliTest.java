/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ade Yusuf Rahardian / 13514079
 */
public class RajawaliTest {
    
    /**
     * Test of getKekuatan method, of class Rajawali.
     */
    @Test
    public void testGetKekuatan() {
        int size = 10;
        System.out.println("getKekuatan");
        Rajawali instance = new Rajawali(size);
        int expResult = 4;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getChar method, of class Rajawali.
     */
    @Test
    public void testGetChar() {
        System.out.println("getChar");
        Rajawali instance = new Rajawali(10);
        char expResult = '#';
        char result = instance.getChar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosisi method, of class Rajawali.
     */
    @Test
    public void testGetPosisi() {
        System.out.println("getPosisi");
        int size = 10;
        Rajawali instance = new Rajawali(size);
//        Point expResult = null;
        Point result = instance.getPosisi();
        assertTrue(result.compareTo(new Point(0,0)) >= 0 && result.compareTo(new Point(size,size)) < 0);
    }

    /**
     * Test of getID method, of class Rajawali.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        int size = 10;
        Rajawali instance = new Rajawali(size);
        int result = instance.getID();
        assertTrue(result >= 0);
    }

    /**
     * Test of incrTime method, of class Rajawali.
     */
    @Test
    public void testIncrTime() {
        System.out.println("incrTime");
        int size = 10;
        Rajawali instance = new Rajawali(size);
        instance.incrTime();
    }
    
}

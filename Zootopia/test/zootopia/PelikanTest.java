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
public class PelikanTest {
    /**
     * Test of getKekuatan method, of class Pelikan.
     */
    @Test
    public void testGetKekuatan() {
        int size = 10;
        System.out.println("getKekuatan");
        Pelikan instance = new Pelikan(size);
        int expResult = 3;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getChar method, of class Pelikan.
     */
    @Test
    public void testGetChar() {
        System.out.println("getChar");
        Pelikan instance = new Pelikan(10);
        char expResult = '$';
        char result = instance.getChar();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosisi method, of class Pelikan.
     */
    @Test
    public void testGetPosisi() {
        int size = 10;
        Pelikan instance = new Pelikan(size);
        Point result = instance.getPosisi();
        assertTrue(result.compareTo(new Point(0,0)) >= 0 && result.compareTo(new Point(size,size)) < 0);
    }

    /**
     * Test of getID method, of class Pelikan.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        int size = 10;
        Pelikan instance = new Pelikan(size);
        int result = instance.getID();
        assertTrue(result >= 0);
    }

    /**
     * Test of incrTime method, of class Pelikan.
     */
    @Test
    public void testIncrTime() {
        System.out.println("incrTime");
        int size = 10;
        Garuda instance = new Garuda(size);
        instance.incrTime();
    }
    
}

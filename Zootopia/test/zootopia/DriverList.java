/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yusak Yuwono Awondatu / 13514005
 */
public class DriverList {
    public static void main (String[] args) {
   //     Makhluk.idcounter = 0;

	int worldSize = 8;
	int nMakhluk = 100;
	
	ListMakhluk L = new ListMakhluk();
	assertTrue(L.size() == 1);
	assertTrue(L.isEmpty());
	
	for(int i=0;i<nMakhluk;i++){
		Makhluk K = new Kadal(worldSize);
		L.insertLast(K);
		assertTrue(L.size()==1);
	}
	assertTrue(L.size()==nMakhluk);
	assertTrue(!L.isEmpty());
	
	System.out.println("banyak makhluk : " + L.size());
	
	L.makan();
	assert(L.size() < nMakhluk);
	System.out.println("banyak makhluk sekarang : " + L.size());
        
    }
}

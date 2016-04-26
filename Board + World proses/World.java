package zootopia;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * World adalah kelas yang mengatur semua kehidupan Makhluk dan perilakunya.
 * @version 1.0
 */
public class World {

  /**
  * Atribut listM sebagai ListMakhluk .
  */
  private final ListMakhluk listM;

  /**
  * Atribut board pengamatan.
  */
  private final Board m;

  /**
  * ctor kelas World, menciptakan board dengan ukuran tertentu.
  * @author Yusak Yuwono Awondatu / 13514005
  * @param size
  */
  public World(final int size) {
    m = new Board(size);
    listM = new ListMakhluk();
  }

  /**
  * Mengembalikan ListM yang merupakan ListMakhluk.
  * @author Ade Yusuf Rahardian / 13514079
  * @return ListM.getList()
  */
  public final Vector<Makhluk> getList() {
    return listM.getList();
  }

  public final Board getBoard() {
      return m;
  }
  
  
  /**
  * Menciptakan makhluk pada dunia dengan posisi random.
  * @author Yusak Yuwono Awondatu / 13514005
  */
  public final void createMakhluk() {
    final int nMakhluk = 8;
    final int idElang = 0;
    final int idGaruda = 1;
    final int idRajawali = 2;
    final int idPelikan = 3;
    final int idCicak = 4;
    final int idKadal = 5;
    final int idKatak = 6;
    final int idBelut = 7;
    int temp;
    Makhluk p;
    Random randomGenerator = new Random();
    temp = randomGenerator.nextInt(nMakhluk);

    if (temp == idElang) {
      p = new Elang(m.getSize());
    } else if (temp == idGaruda) {
      p = new Garuda(m.getSize());
    } else if (temp == idRajawali) {
      p = new Rajawali(m.getSize());
    } else if (temp == idPelikan) {
      p = new Pelikan(m.getSize());
    } else if (temp == idCicak) {
      p = new Cicak(m.getSize());
    } else if (temp == idKadal) {
      p = new Kadal(m.getSize());
    } else if (temp == idKatak) {
      p = new Katak(m.getSize());
    } else {
      p = new Belut(m.getSize());
    }
    listM.insertLast(p);
  }

  /**
    * update() akan mengatur kondisi dunia, mencetak dunia dan mengelola
    * makan memakan.
    * @author Yusak Yuwono Awondatu / 13514005
    */
  public void update() {
    listM.makan();
    m.reset();
    for (int i = 0; i < listM.size(); i++) {
      m.setElmt(listM.getList().get(i).getPosisi(),
              listM.getList().get(i).getChar());
    }
//    s = m.print();
//    System.out.println(s);
  }

  /**
  * Getter jumlah makhluk sampai sekarang ini.
  * @author Yusak Yuwono Awondatu / 13514005
  * @return NbMakhluk
  */
  public final int getNbMakhluk() {
    return listM.size();
  }

  /**
  * Menyimpan screen shot program ke dalam file eksternal.
  * @author Yusak Yuwono Awondatu / 13514005
  */
  public final void printExt() {
    int size = listM.size();
    if (size <= 1) {
      try (FileWriter out = new FileWriter("screenshot.txt")) {
        for (int i = 0; i < size + 2; i++) {
          out.write("-");
        }
        out.write("\r\n");
        for (int i = size - 1; i >= 0; i--) {
          out.write("|");
          for (int j = 0; j < size; j++) {
            out.write(" ");
            }
          out.write("|\r\n");
        }
        for (int i = 0; i < size + 2; i++) {
          out.write("-");
        }
        out.write("\r\n");
      } catch (IOException ex) {
          Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
      }
    } else {
      try {
        m.printExt();
      } catch (IOException ex) {
        Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
}

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
  * Atribut snake player.
  */
  private final Snake s;
  
  /**
  * Atribut score player.
  */
  private int score;
  
  /**
  * Atribut score player.
  */
  private boolean isGameOver;
  
  /**
  * ctor kelas World, menciptakan board dengan ukuran tertentu.
  * @author Yusak Yuwono Awondatu / 13514005
  * @param size
  */
  public World(final int size) {
    m = new Board(size);
    listM = new ListMakhluk();
    s = new Snake(size);
    score = 0;
    isGameOver = false;
  }

  /**
  * Mengembalikan ListM yang merupakan ListMakhluk.
  * @author Ade Yusuf Rahardian / 13514079
  * @return ListM.getList()
  */
  public final Vector<Makhluk> getList() {
    return listM.getList();
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
  public final void update() {
    if (!isGameOver) {
      for (int i = 0; i < getNbMakhluk(); i++) {
        getList().get(i).incrTime();
        getList().get(i).move();
      }
      listM.makan();
      
      Point front = new Point(s.getHead().getPos());
      if (s.getDirection() == 'U') {
        front.setY(front.getY()-1);
      } else if (s.getDirection() == 'D') {
        front.setY(front.getY()+1);
      } else if (s.getDirection() == 'L') {
        front.setY(front.getX()-1);
      } else if (s.getDirection() == 'R') {
        front.setY(front.getX()+1);
      }
      boolean isEating = false;
      for (int i = 0; i < getNbMakhluk(); i++) {
        if (getList().get(i).getPosisi().equals(front)) {
          getList().remove(i);
          isEating = true;
          score++;
          i--;
        }
      }
      if(isEating) {
        s.eat();
      } else {
        s.move();
      }
      while (getNbMakhluk() < m.getSize()*m.getSize()/50 || getNbMakhluk() < 3) {
        createMakhluk();
      }
      m.reset();
      for (int i = 0; i < listM.size(); i++) {
        m.setElmt(listM.getList().get(i).getPosisi(),
                listM.getList().get(i).getChar());
      }
      Snake.SnakeBody iterator;
      iterator = s.getTail();
      while(iterator != s.getHead()) {
        m.setElmt(iterator.getPos(), 'o');
        iterator = iterator.getNext();
      }
      if (m.getElmt(iterator.getPos()) == 'o') {
        m.setElmt(iterator.getPos(), 'X');
        isGameOver = true;
      } else {
        m.setElmt(iterator.getPos(), 'O');
      }
      m.print();
    }
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
    try {
      m.printExt();
    } catch (IOException ex) {
      Logger.getLogger(World.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  public final int getScore() {
    return score;
  }
  
  public final void setDirection(char c) {
    if (c == 'U' && s.getDirection()!= 'D') {
      s.setDirection(c);
    } else if (c == 'D' && s.getDirection()!= 'U') {
      s.setDirection(c);
    } else if (c == 'L' && s.getDirection()!= 'R') {
      s.setDirection(c);
    } else if (c == 'R' && s.getDirection()!= 'L') {
      s.setDirection(c);
    }
  }
  
  public final char getDirection() {
    return s.getDirection();
  }
  
  public final boolean getGameOverStatus() {
    return isGameOver;
  }
}

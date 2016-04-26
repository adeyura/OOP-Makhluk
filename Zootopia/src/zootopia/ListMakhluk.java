package zootopia;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * List yang mengatur para Makhluk di dunia.
 * @version 1.0
 */
public class ListMakhluk {

  /**
  * Container berbentuk vektor untuk menyimpan makhluk.
  */
  private final Vector<Makhluk> l;

  /**
  * ctor kelas ListMakhluk.
  * terdapat inisialisasi instance dari Vector.
  * @author Yusak Yuwono Awondatu / 13514005
  */
  public ListMakhluk() {
    l = new Vector<>();
  }

  /**
  * Mengembalikan vektor berisi Makhluk.
  * @author Ade Yusuf Rahardian / 13514079
  * @return l
  */
  public final Vector<Makhluk> getList() {
    return l;
  }

  /**
  * Memeriksa apakah vektor kosong atau tidak, true bila kosong dan
  * sebaliknya.
  * @author Yusak Yuwono Awondatu / 13514005
  * @return boolean
  */
  public final boolean isEmpty() {
    return l.isEmpty();
  }

  /**
  * Getter ukuran Vektor.
  * @author Yusak Yuwono Awondatu / 13514005
  * @return l.size
  */
  public final int size() {
    return l.size();
  }

  /**
  * Method untuk menambahkan d yaitu Makhluk ke dalam vektor.
  * @author Ade Yusuf Rahardian / 13514079
  * @param d
  */
  public final void insertLast(final Makhluk d) {
    l.add(d);
  }

  /**
  * Method untuk menghapus Makhluk yang memiliki Kekuatan terkecil di
  * kpordinat tertentu.
  * @author Ade Yusuf Rahardian / 13514079
  * @param p
  */
  public final void deleteMinPoint(final Point p) {
    final int startmin = 999999;
    int min = startmin;
    int imin = 0;
    // cari minimum
    for (int i = 0; i < l.size(); i++) {
      if ((l.get(i).getPosisi() == p) && (l.get(i).getKekuatan() < min)) {
        min = l.get(i).getKekuatan();
        imin = i;
      }
    }
    l.removeElementAt(imin);
  }

  /**
  * Method makan() digunakan untuk mengatur makan memakan antar Makhluk pada
  * board.
  * @author Ade Yusuf Rahardian / 13514079
  */
  public final void makan() {
    Map<Point, Integer> countMap = new HashMap<>();
    for (int i = 0; i < l.size(); i++) {
      int count;
      if (countMap.containsKey(l.get(i).getPosisi())) {
        count = countMap.get(l.get(i).getPosisi());
      } else {
        count = 0;
      }
      countMap.put(l.get(i).getPosisi(), count + 1);
    }
    for (Point key : countMap.keySet()) {
      Integer value = countMap.get(key);
      if (value > 1) {
        deleteMinPoint(key);
      }
    }
  }
}

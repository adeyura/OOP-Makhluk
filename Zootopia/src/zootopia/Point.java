package zootopia;
/**
* Kelas Point yang digunakan sebagai kordinat posisi setiap Makhluk.
* @author Cendhika Imantoro / 13514037
* @version 1.0
*/
public class Point implements Comparable<Point> {

  /**
  * Absis dari kelas Point.
  */
  private int x;

  /**
   * Ordinat dari kelas Point.
   */
  private int y;

  /**
  * ctor kelas Point, absis dan ordinat diset 0.
  */
  Point() {
    x = 0;
    y = 0;
  }

  /**
  * ctor kelas Point, absis dan ordinat diisi dengan input pengguna.
  * @param nx
  * @param ny
  */
  Point(final int nx, final int ny) {
    x = nx;
    y = ny;
  }
  
  /**
  * ctor kelas Point, absis dan ordinat diisi dengan input pengguna.
  * @param p
  */
  Point(Point p) {
    x = p.getX();
    y = p.getY();
  }

  /**
  * Getter absis dari kelas Point.
  * @return x
  */
  public final int getX() {
    return x;
  }

  /**
  * Getter ordinat dari kelas Point.
  * @return y
  */
  public final int getY() {
    return y;
  }

  /**
  * Setter kelas Point, absis diisi dengan n.
  * @param n
  */
  public final void setX(final int n) {
    x = n;
  }

  /**
  * Setter kelas Point, ordinat diisi dengan n.
  * @param n
  */
  public final void setY(final int n) {
    y = n;
  }

  /**
  * method override dari Interface Comparable yang digunakan untuk
  * overloading operator.
  * @param p
  * @return int
  */
  @Override
  public final int compareTo(final Point p) {
    if (getX() < p.getX() || (getX() == p.getX() && getY() < p.getY())) {
      return  -1;
    } else if (getX() == p.getX() && getY() == p.getY()) {
      return 0;
    } else {
      return 1;
    }
  }

  /**
  * Digunakan agar API Maps dapat digunakan.
  * @param o
  * @return boolean
  */
  @Override
  public final boolean equals(final Object o) {
    if (o == null) {
      return false;
    }
    if (!(o instanceof Point)) {
      return false;
    }
    return (x == ((Point) o).x && y == ((Point) o).y);
  }

  /**
  * Digunakan agar API Maps dapat digunakan.
  * @return int
  */
  @Override
  public final int hashCode() {
    long bits = x;
    final int intbytesize = 8;
    bits ^= y * (intbytesize - 1);
    return (((int) bits) ^ ((int) (bits >> (intbytesize))));
  }
}
package zootopia;

/**
 * Sebuah abstract class Makhluk yang turunannya adalah Aves Reptil dan Amfibia.
 * Pembagian ini berdasarkan pergerakan dari masing-masing hewan.
 * @author Cendhika Imantoro / 13514037
 * @author Yusak Yuwono Awondatu / 13514005
 * @version 1.0
 */

public abstract class Makhluk {

  /**
  * Getter Kekuatan Makhluk.
  * @return kekuatan
  */
  public abstract int getKekuatan();

  /**
  * Getter char setiap Makhluk.
  * @return char
  */
  public abstract char getChar();

  /**
  * Getter posisi Makhluk dalam kordinat Point.
  * @return p
  */
  public abstract Point getPosisi();

  /**
  * Getter ID setiap Makhluk.
  * @return ID
  */
  public abstract int getID();

  /**
  * Procedure untuk me-increment waktu dunia.
  */
  public abstract void incrTime();

  /**
  * Procedure untuk membuat Makhluk bergerak di board.
  */
  public abstract void move();

  /**
  * Nilai kekuatan setiap Makhluk.
  */
  protected int kekuatan;

  /**
  * ID setiap makhluk yang unik membedakan setiap makhluk.
  */
  protected int id;

  /**
  * Berisi berapa banyak ID Makhluk yang sudah dibuat.
  */
  protected static int idcounter;

  /**
  * Identitas Makhluk yang ditampilkan di Board.
  */
  protected char c;

  /**
  * Posisi Makhluk dalam kordinat Point.
  */
  protected Point p = new Point();

  /**
  * Delta time tertentu akan membuat makhluk bergerak.
  */
  protected int deltatime;

  /**
  * Variabel waktu dunia.
  */
  protected int waktu;

  /**
  * Ukuran Dunia.
  */
  protected int worldSize;
}
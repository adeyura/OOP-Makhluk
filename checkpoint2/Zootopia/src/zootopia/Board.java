package zootopia;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Kelas Board adalah sebuah kelas interface tempat para makhluk bergerak dan
 * berinteraksi satu sama lain.
 * @author Ade Yusuf Rahardian \ 13514079
 * @version 1.0
 */
public class Board {

  /**
  * Atribut size board.
  */
  private final int size;

  /**
  * Atribut matriks board.
  */
  private final char[][] c;

  /**
  * Konstanta banyak line kosong yang dicetak tiap awal board.
  */
  private final int nEmptyLine = 20;

  /**
  * ctor kelas Board, inisialisasi matriks dunia dengan ukuran.
  * tertentu
  * @param sz
  */
  public Board(final int sz) {
    size = sz;
    c = new char[sz][sz];
  }

  /**
  * Method print() digunakan untuk mencetak board ke layar.
  */
  public String print() {
    String s = "<html><pre>";
   /* for (int i = 0; i < nEmptyLine; i++) {
      System.out.println("");
    }*/
    for (int i = 0; i < size + 2; i++) {
      s += "-";
    }
    s += "<br>";
    for (int i = 0; i < size; i++) {
      s += "|";
      for (int j = 0; j < size; j++) {
          s += c[j][i];
      }
      s += "|<br>";
    }
    for (int i = 0; i < size + 2; i++) {
      s += "-";
    }
    s += "<br></pre></html>";
    return s;
  }

  /**
  * Method reset() digunakan untuk mengosongkan isi board.
  */
  public final void reset() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        c[i][j] = ' ';
      }
    }
  }

  /**
  * Getter ukuran board.
  * @return size
  */
  public final int getSize() {
    return size;
  }

  /**
  * Getter elemen board pada posisi x,y.
  * @param p
  * @return c[][]
  */
  public final char getElmt(final Point p) {
    return c[p.getX()][p.getY()];
  }

  /**
  * Setter elemen board pada x,y dengan char tertentu.
  * @param pos
  * @param cc
  */
  public final void setElmt(final Point pos, final char cc) {
    this.c[pos.getX()][pos.getY()] = cc;
  }

  /**
  * Method untuk mencetak Board ke file eksternal.
  * @throws IOException
  */
  public final void printExt() throws IOException {
    try (FileWriter out = new FileWriter("screenshot.txt")) {
      for (int i = 0; i < size + 2; i++) {
        out.write("-");
      }
      out.write("\r\n");
      for (int i = 0; i < size; i++) {
        out.write("|");
        for (int j = 0; j < size; j++) {
          out.write(c[j][i]);
        }
        out.write("|\r\n");
      }
      for (int i = 0; i < size + 2; i++) {
        out.write("-");
      }
      out.write("\r\n");
    }
  }
}

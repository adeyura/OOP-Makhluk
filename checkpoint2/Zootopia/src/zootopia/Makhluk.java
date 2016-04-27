package zootopia;

/**
 * Sebuah abstract class Makhluk yang turunannya adalah Aves Reptil dan Amfibia.
 * Pembagian ini berdasarkan pergerakan dari masing-masing hewan.
 * @author Cendhika Imantoro / 13514037
 * @version 1.0
 */

public abstract class Makhluk {

  /**
  * Getter Kekuatan Makhluk.
  * @return kekuatan
  */
  public int getKekuatan(){
      return kekuatan;
  }

  /**
  * Getter char setiap Makhluk.
  * @return char
  */
  public char getChar(){
      return c;
  }

  /**
  * Getter posisi Makhluk dalam kordinat Point.
  * @return p
  */
  public Point getPosisi(){
    return p;
  }

  /**
  * Getter ID setiap Makhluk.
  * @return ID
  */
  public int getID(){
    return id;
  }

  /**
  * Procedure untuk me-increment waktu dunia.
  */
  public void incrTime(){
      setWaktu(getWaktu()+1);
  }

  /**
  * Procedure untuk membuat Makhluk bergerak di board.
  */
  public abstract void move();

  /**
  * Nilai kekuatan setiap Makhluk.
  */
  private int kekuatan;

  /**
   * Procedure untuk mengubah nilai kekuatan
   * @param k 
   */
  public void setKekuatan(int k){
      kekuatan=k;
  }
  
  /**
  * ID setiap makhluk yang unik membedakan setiap makhluk.
  */
  private int id;

  /**
   * Setter id
   * @param x
   */
  public void setID(int x){
      id=x;
  }
  
  /**
  * Berisi berapa banyak ID Makhluk yang sudah dibuat.
  */
  private static int idcounter;
  
  /**
   * Getter idcounter
   * @return idcounter
   */
  public int getIDCounter(){
    return idcounter;
  }
  
  /**
   * Setter IDcounter
   * @param x 
   */
  public void setIDCounter(int x){
      idcounter=x;
  }
  

  /**
  * Identitas Makhluk yang ditampilkan di Board.
  */
  private char c;
  
  /**
   * Setter c
   * @param C 
   */
  public void setChar(char C){
      c=C;
  }
  
  /**
  * Posisi Makhluk dalam kordinat Point.
  */
  private Point p = new Point();
  
  /**
   * Setter p.x
   * @param x 
   */
  public void setPX(int x){
    p.setX(x);
  }
  
  /**
   * Setter p.y
   * @param y 
   */
  public void setPY(int y){
    p.setY(y);
  }
  
  /**
  * Delta time tertentu akan membuat makhluk bergerak.
  */
  private int deltatime;

  /**
   * Setter deltatime
   * @param t 
   */
  public void setDeltaTime(int t){
      deltatime=t;
  }
  
  /**
   * Getter deltatime
   * @return deltatime
   */
  public int getDeltaTime(){
      return deltatime;
  }
  
  /**
  * Variabel waktu dunia.
  */
  private int waktu;

  /**
   * Setter waktu
   * @param t 
   */
  public void setWaktu(int t){
      waktu=t;
  }

  /**
   * Getter waktu
   * @return waktu
   */
  public int getWaktu(){
      return waktu;
  }
  
  /**
  * Ukuran Dunia.
  */
  private int worldSize;
  
  /**
   * Getter worldSize
   * @return worldSize
   */
  public int getWorldSize(){
      return worldSize;
  }
  
  /**
   * Setter worldSize
   * @param w 
   */
  public void setWorldSize(int w){
      worldSize=w;
  }
  
}
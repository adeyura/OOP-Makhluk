/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;
/**
 * Kelas yang merupakan representasi player dalam game.
 * @author Cendhika Imantoro / 13514037
 */
public class Snake {

  /**
  * Konstanta arah atas.
  */
  private static final char UP = 'U';
  
  /**
  * Konstanta arah bawah.
  */
  private static final char DOWN = 'D';
  
  /**
  * Konstanta arah kiri.
  */
  private static final char LEFT = 'L';
  
  /**
  * Konstanta arah kanan.
  */
  private static final char RIGHT = 'R';
  
  /**
  * Konstanta arah null.
  */
  private static final char NULL = 'N';
  
  /**
  * Konstanta posisi standar.
  */
  private static final Point DEFAULT_POSITION = new Point(0, 0);

  /**
  * Kelas bagian badan Snake.
  */
  public class SnakeBody {

    /**
    * Atribut posisi bagian badan Snake.
    */
    private final Point pos = new Point(DEFAULT_POSITION);
    
    /**
    * Atribut arah badan snake sebelum badan snake ini.
    */
    private char from = NULL;
    
    /**
    * Atribut letak badan snake setelah badan snake ini.
    */
    private char to = NULL;
    
    /**
    * Atribut badan snake setelah badan snake ini.
    */
    private SnakeBody next = null;

    /**
    * Getter atribut pos.
    */
    public final Point getPos() {
      return pos;
    }

    /**
    * Getter atribut from.
    */
    public final char getFrom() {
      return from;
    }

    /**
    * Getter atribut to.
    */
    public final char getTo() {
      return to;
    }

    /**
    * Getter atribut next.
    */
    public final SnakeBody getNext() {
      return next;
    }

    /**
    * Setter atribut pos.
    * @param x
    * @param y
    */
    public final void setPos(final int x, final int y) {
      pos.setX(x);
      pos.setY(y);
    }

    /**
    * Setter atribut pos.
    * @param p
    */
    public final void setPos(final Point p) {
      if (p != null) {
        pos.setX(p.getX());
        pos.setY(p.getY());
      }
    }

    /**
    * Setter atribut from.
    * @param c
    */
    public final void setFrom(final char c) {
      from = c;
    }

    /**
    * Setter atribut to.
    * @param c
    */
    public final void setTo(final char c) {
      to = c;
    }

    /**
    * Setter atribut next.
    * @param s
    */
    public final void setNext(final SnakeBody s) {
      next = s;
    }
  }

  /**
  * Konstanta arah gerak default.
  */
  private static final char DEFAULT_DIRECTION = RIGHT;
  
  /**
  * Konstanta panjang default.
  */
  private static final int DEFAULT_LENGTH = 3;
  
  /**
  * Atribut ukuran dunia.
  */
  private final int worldsize;
  
  /**
  * Atribut kepala snake.
  */
  private SnakeBody head;
  
  /**
  * Atribut ekor snake.
  */
  private SnakeBody tail;
  
  /**
  * Atribut panjang snake.
  */
  private int length;
  
  /**
  * Atribut arah gerak snake.
  */
  private char direction = DEFAULT_DIRECTION;

  /**
  * Konstruktor snake dengan parameter ukuran dunia
  * @param size
  */
  Snake(int size) {
    head = new SnakeBody();
    tail = new SnakeBody();
    SnakeBody mid = new SnakeBody();

    head.setPos(new Point(size / 2 + 1, size / 2));
    mid.setPos(new Point(size / 2, size / 2));
    tail.setPos(new Point(size / 2 - 1, size / 2));

    head.setFrom(LEFT);
    mid.setFrom(LEFT);
    mid.setTo(RIGHT);
    tail.setTo(RIGHT);

    tail.setNext(mid);
    mid.setNext(head);

    length = DEFAULT_LENGTH;
    worldsize = size;
  }  

  /**
  * Getter atribut tail.
  */
  public final SnakeBody getTail() {
    return tail;
  }

  /**
  * Getter atribut head.
  */
  public final SnakeBody getHead() {
    return head;
  }

  /**
  * Getter atribut direction.
  */
  public final char getDirection() {
    return direction;
  }

  /**
  * Getter atribut length.
  */
  public final int getLength() {
    return length;
  }

  /**
  * Setter atribut tail.
  * @param newTail
  */
  public final void setTail(final SnakeBody newTail) {
    tail = newTail;
  }

  /**
  * Setter atribut head.
  * @param newHead
  */
  public final void setHead(final SnakeBody newHead) {
    head = newHead;
  }

  /**
  * Setter atribut direction.
  * @param newDirection
  */
  public final void setDirection(final char newDirection) {
    direction = newDirection;
  }

  /**
  * Setter atribut length
  * @param newLength
  */
  public final void setLength(final int newLength) {
    length = newLength;
  }

  /**
  * Prosedur menggerakkan snake satu langkah.
  */
  public final void move() {
    if (getDirection() == UP) {
      getTail().setFrom(DOWN);
      getTail().setPos(getHead().getPos().getX(), (getHead().getPos().getY() - 1 + worldsize) % worldsize);
    } else if (getDirection() == DOWN) {
      getTail().setFrom(UP);
      getTail().setPos(getHead().getPos().getX(), (getHead().getPos().getY() + 1) % worldsize);
    } else if (getDirection() == LEFT) {
      getTail().setFrom(RIGHT);
      getTail().setPos((getHead().getPos().getX() - 1 + worldsize) % worldsize, getHead().getPos().getY());
    } else if (getDirection() == RIGHT) {
      getTail().setFrom(LEFT);
      getTail().setPos((getHead().getPos().getX() + 1) % worldsize, getHead().getPos().getY());
    }

    getHead().setTo(getDirection());
    getHead().setNext(getTail());
    
    setHead(getTail());
    setTail(getTail().getNext());
    
    getTail().setFrom(NULL);
    
    getHead().setNext(null);
    getHead().setTo(NULL);
  }

  /**
  * Prosedur mengubah snake ketika memakan
  */
  public final void eat() {
    SnakeBody temp = new SnakeBody();

    if (getDirection() == UP) {
      temp.setFrom(DOWN);
      temp.setPos(getHead().getPos().getX(), (getHead().getPos().getY() - 1 + worldsize) % worldsize);
    } else if (getDirection() == DOWN) {
      temp.setFrom(UP);
      temp.setPos(getHead().getPos().getX(), (getHead().getPos().getY() + 1) % worldsize);
    } else if (getDirection() == LEFT) {
      temp.setFrom(RIGHT);
      temp.setPos((getHead().getPos().getX() - 1 + worldsize) % worldsize, getHead().getPos().getY());
    } else if (getDirection() == RIGHT) {
      temp.setFrom(LEFT);
      temp.setPos((getHead().getPos().getX() + 1) % worldsize, getHead().getPos().getY());
    }

    
    getHead().setTo(getDirection());
    getHead().setNext(temp);
    
    setHead(temp);
    
    getHead().setNext(null);
    getHead().setTo(NULL);
   
    setLength(getLength() + 1);
  }
}


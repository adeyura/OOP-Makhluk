/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootopia;
/**
 *
 * @author ASUS-A451LB
 */
public class Snake {

  private static final char UP = 'U';
  private static final char DOWN = 'D';
  private static final char LEFT = 'L';
  private static final char RIGHT = 'R';
  private static final char NULL = 'N';
  private static final Point DEFAULT_POSITION = new Point(0, 0);

  public class SnakeBody {

    private final Point pos = new Point(DEFAULT_POSITION);
    private char from = NULL;
    private char to = NULL;
    private SnakeBody next = null;

    public final Point getPos() {
      return pos;
    }

    public final char getFrom() {
      return from;
    }

    public final char getTo() {
      return to;
    }

    public final SnakeBody getNext() {
      return next;
    }

    public final void setPos(final int x, final int y) {
      pos.setX(x);
      pos.setY(y);
    }

    public final void setPos(final Point p) {
      if (p != null) {
        pos.setX(p.getX());
        pos.setY(p.getY());
      }
    }

    public final void setFrom(final char c) {
      from = c;
    }

    public final void setTo(final char c) {
      to = c;
    }

    public final void setNext(final SnakeBody s) {
      next = s;
    }
  }

  private static final char DEFAULT_DIRECTION = RIGHT;
  private static final int DEFAULT_LENGTH = 3;
  private final int worldsize;
  private SnakeBody head;
  private SnakeBody tail;
  private int length;
  private char direction = DEFAULT_DIRECTION;

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

  public final SnakeBody getTail() {
    return tail;
  }

  public final SnakeBody getHead() {
    return head;
  }

  public final char getDirection() {
    return direction;
  }

  public final int getLength() {
    return length;
  }

  public final void setTail(final SnakeBody newTail) {
    tail = newTail;
  }

  public final void setHead(final SnakeBody newHead) {
    head = newHead;
  }

  public final void setDirection(final char newDirection) {
    direction = newDirection;
  }

  public final void setLength(final int newLength) {
    length = newLength;
  }

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


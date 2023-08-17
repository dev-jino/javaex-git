package challengeCh06;

public class PointTest {
  public static void main(String[] args) {
    Point p1 = new Point(5,6);
    System.out.println(p1.toString());

    Point p2 = new MovablePoint(3, 4, 30, 40);
    System.out.println(p2.toString());
  }
}

class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "x=" + x + ", y=" + y;
  }
}

class MovablePoint extends Point {
  private int xSpeed;
  private int ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public int getxSpeed() {
    return xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  @Override
  public String toString() {
    return "x=" + super.getX() + ", y=" + super.getY() + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
  }
}
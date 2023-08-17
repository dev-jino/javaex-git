package chapter07;

public class AbstractClassEx {
  public static void main(String[] args) {
    Circle c = new Circle(1);
    c.draw();
    System.out.println(c.findArea());
    Square s = new Square(2, 4);
    s.draw();
    System.out.println(s.findArea());
  }
}

abstract class Shape {
  double pi = 3.14;
  abstract void draw();
  public double findArea() {
    return 0.0;
  }
}

class Circle extends Shape {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  void draw() {
    System.out.println("원을 그리다.");
  }

  @Override
  public double findArea() {
    return pi * radius * radius;
  }
}

class Square extends Shape {
  int width;
  int height;

  public Square(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  void draw() {
    System.out.println("사각형을 그리다.");
  }

  @Override
  public double findArea() {
    return width * height;
  }
}
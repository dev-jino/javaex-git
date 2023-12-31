package classExample;

public class UseCircle {
  public static void main(String[] args) {
    Circle circle = new Circle(20.0);
    System.out.println("circle = " + circle);

    Circle circle2 = new Circle(30.0);
    System.out.println("circle2 = " + circle2);

    circle = circle2;
    System.out.println("circle = " + circle);
    System.out.println("circle2 = " + circle2);

    // 생성자를 만들경우, 기본 생성자는 생성되지 않음

    Circle circle3 = new Circle();
    circle3.setRadius(20.0);
    System.out.println("circle3.getRadius() = " + circle3.getRadius());
  }
}

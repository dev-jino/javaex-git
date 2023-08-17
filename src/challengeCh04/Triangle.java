package challengeCh04;

public class Triangle {
  private double width;
  private double height;

  public Triangle(double height, double width) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    if (width <= 0.0) {
      System.out.println("밑변은 0보다 커야합니다.");
      return;
    }
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height <= 0.0) {
      System.out.println("높이는 0보다 커야합니다.");
      return;
    }
    this.height = height;
  }

  public double findArea() {
    return 0.5 * this.width * this.height;
  }

  public boolean isSameArea(Triangle triangle) {
//    if (this.findArea() == triangle.findArea()) {
//      return true;
//    } else {
//      return false;
//    }
    return this.findArea() == triangle.findArea();
  }
}

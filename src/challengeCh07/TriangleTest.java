package challengeCh07;

public class TriangleTest {
  // 삼각형의 넓이를 기준으로 크기를 비교하는 프로그램 작성하기
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10, 10);
    Triangle t2 = new Triangle(5, 10);
//    Line l1 = new Line(30);

    int res = t1.compareTo(t2);
//    int res = t1.compareTo(l1);
    if (res > 0) {
      System.out.println(t1 + "이 더 큽니다.");
    } else if (res < 0) {
      System.out.println(t2 + "이 더 큽니다.");
    } else {
      System.out.println("두 삼각형의 크기가 같거나 비교할 수 없습니다.");
    }

  }
}

class Triangle implements Comparable{
  int width;
  int height;

  public Triangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  private double findArea() {
    return (double)this.width * this.height / 2;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Triangle) {
      return (int)(this.findArea() - ((Triangle)o).findArea());
    }
    return 0;
  }

  @Override
  public String toString() {
    return "삼각형 [" +
        "밑변 = " + width +
        ", 높이 = " + height +
        ", 넓이 = " + this.findArea() +
        "]";
  }
}
package method;

public class Method3Ex {
  public static void main(String[] args) {
    MyMath myMath = new MyMath();
    long res1 = myMath.add(10L, 20L);
    long res2 = myMath.div(10L, 20L);

    System.out.printf("res1, res2 = %d %d\n", res1, res2);
  }
}

class MyMath {
  long add(long num1, long num2) {
    return num1 + num2;
  }

  long div(long num1, long num2) {
    if (num2 == 0) {
      System.out.println("0으로 나눌 수 없습니다.");
      return 0;
    }
    return num1 / num2;
  }
}